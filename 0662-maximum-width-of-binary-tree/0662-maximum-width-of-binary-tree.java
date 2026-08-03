import java.util.LinkedList;
import java.util.Queue;



class Solution {

    private static class Indexed {
        TreeNode node;
        long id;

        Indexed(TreeNode node, long id) {
            this.node = node;
            this.id = id;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int maxWidth = 0;
        Queue<Indexed> queue = new LinkedList<>();
        queue.offer(new Indexed(root, 0));

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            long levelStartId = queue.peek().id;

            long firstId = 0, lastId = 0;

            for (int i = 0; i < levelSize; i++) {
                Indexed current = queue.poll();
                long normalizedId = current.id - levelStartId;

                if (i == 0) firstId = normalizedId;
                if (i == levelSize - 1) lastId = normalizedId;

                if (current.node.left != null) {
                    queue.offer(new Indexed(current.node.left, normalizedId * 2 + 1));
                }
                if (current.node.right != null) {
                    queue.offer(new Indexed(current.node.right, normalizedId * 2 + 2));
                }
            }

            maxWidth = Math.max(maxWidth, (int) (lastId - firstId + 1));
        }

        return maxWidth;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}