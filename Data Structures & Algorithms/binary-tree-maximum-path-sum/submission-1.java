class Solution {
    int maxSum=Integer.MIN_VALUE;
    public int sumCalculate(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Math.max(sumCalculate(root.left), 0);
        int right=Math.max(sumCalculate(root.right), 0);

        int currentPathSum = left + right + root.val;
        maxSum=Math.max(currentPathSum, maxSum);
        
        return root.val + Math.max(left, right);
    }
    public int maxPathSum(TreeNode root) {
        sumCalculate(root);
        return maxSum;

    }
}