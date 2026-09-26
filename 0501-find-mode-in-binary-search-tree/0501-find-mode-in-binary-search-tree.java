class Solution {
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        inorder(root, map);

        int max = 0;

        for (int value : map.values()) {
            max = Math.max(max, value);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                ans.add(key);
            }
        }

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }

    public void inorder(TreeNode root, HashMap<Integer, Integer> map) {
        if (root == null) return;

        inorder(root.left, map);

        map.put(root.val, map.getOrDefault(root.val, 0) + 1);

        inorder(root.right, map);
    }
}