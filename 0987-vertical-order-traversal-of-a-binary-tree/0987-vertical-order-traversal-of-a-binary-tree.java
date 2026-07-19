/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Tuple {
    TreeNode node;
    int col; 
    int row; 

    Tuple(TreeNode node, int col, int row) {
        this.node = node;
        this.col = col;
        this.row = row;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        Queue<Tuple> queue = new LinkedList<>();
        queue.offer(new Tuple(root, 0, 0));

        while (!queue.isEmpty()) {
            Tuple tuple = queue.poll();
            TreeNode node = tuple.node;
            int col = tuple.col;
            int row = tuple.row;

            map.computeIfAbsent(col, k -> new TreeMap<>())
               .computeIfAbsent(row, k -> new PriorityQueue<>())
               .offer(node.val);

            if (node.left != null) {
                queue.offer(new Tuple(node.left, col - 1, row + 1));
            }
            if (node.right != null) {
                queue.offer(new Tuple(node.right, col + 1, row + 1));
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> rowsForCol : map.values()) {
            List<Integer> colList = new ArrayList<>();
            for (PriorityQueue<Integer> valuesAtRow : rowsForCol.values()) {
                while (!valuesAtRow.isEmpty()) {
                    colList.add(valuesAtRow.poll());
                }
            }
            result.add(colList);
        }

        return result;
    }
}