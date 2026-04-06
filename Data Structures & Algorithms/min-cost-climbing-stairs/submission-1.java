class Solution {
    public int minCost(int i, int n,int[] cost , int[] dp){
        if(i>=n){
            return 0;
        }

        if(dp[i]!=0){
            return dp[i];
        }
        dp[i]=cost[i]+Math.min(minCost(i+1,n,cost,dp),
        minCost(i+2,n,cost,dp));

        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
       int n=cost.length;
       int[] dp = new int[n+1];
       if(n==1){
            return cost[0];
       }
       return Math.min(minCost(0,n,cost,dp),minCost(1,n,cost,dp));

    }
}
