class Solution {
    int[][] dp;
    public int solve(int i,int j ,int[] nums){
        if(j==nums.length){
            return 0; 
        }
        if(dp[i+1][j]!=-1) return dp[i][j];
        int res=0;
        if(i==-1 || nums[i]<nums[j]){
            res=1+solve(j,j+1,nums);
        }
        dp[i+1][j]=Math.max(res,solve(i,j+1,nums));
        return dp[i+1][j];
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        dp=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(-1,0,nums);
    
    }
}
