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
    int maxSum=Integer.MIN_VALUE;
    public int sumCalculate(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=sumCalculate(root.left);
        int right=sumCalculate(root.right);

        int max = Math.max(Math.max(left+right+root.val, root.val), Math.max(root.val+left, root.val+right));
        maxSum=Math.max(max,maxSum);
        return max;
    }
    public int maxPathSum(TreeNode root) {
        sumCalculate(root);
        return maxSum;

    }
}
