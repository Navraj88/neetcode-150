class Solution {
    public int solve(int i, int[] nums,int[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=0){
            return dp[i];
        }
        int take=nums[i]+ solve(i+2,nums,dp);
        int notTake= solve(i+1,nums,dp);
        
        dp[i]=Math.max(take,notTake);
        return dp[i];
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        return solve(0,nums,dp);
    }
}
