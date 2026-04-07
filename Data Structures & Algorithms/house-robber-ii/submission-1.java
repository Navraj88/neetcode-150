class Solution {
    public int solve(int i, int flag, int[] nums,int[][] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i][flag]!=0){
            return dp[i][flag];
        }
        int take=0,notTake=0;
        if(flag==1 && i==nums.length-1){
            return dp[i][flag]=0;
        }
        notTake=solve(i+1,flag,nums,dp);
        if(i==0) flag=1;
        take=nums[i]+ solve(i+2,flag,nums,dp);
        dp[i][flag]=Math.max(take,notTake);
        return dp[i][flag];
    }
    public int rob(int[] nums) {
        int[][] dp = new int[nums.length][2]; 
        return solve(0,0,nums,dp);
    }
}
