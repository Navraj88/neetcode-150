class Solution {
    public int solve(int s,int n,int[] dp){
        if(s==n){
            return 1;
        }
        if(dp[s]!=0){
            return dp[s];
        }
        int l=0;
        int r=0;
        if(s+1<=n){
            l=solve(s+1,n,dp);
        }
        if(s+2<=n){
            r=solve(s+2,n,dp);
        }
        dp[s]=l+r;
        return dp[s];
    }
    public int climbStairs(int n) {
        int[] dp= new int[n+1];
        return solve(0,n,dp);
    }
}
