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
class Solution {
    private int maxi = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxi;
    }
     private int maxPath(TreeNode root){ 
        if(root==null){
            return 0;
        }
        int leftsum=Math.max(maxPath(root.left),0);
        int rightsum=Math.max(maxPath(root.right),0);
        maxi=Math.max(maxi,leftsum+rightsum+root.val);
        return root.val+Math.max(leftsum,rightsum);
        
    }
}