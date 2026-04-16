class Solution {
    int[][]dp;
    public int solve(int i,int buying ,int[] prices){

        if(i>=prices.length) return 0;
        if(dp[i][buying]!=-1) return dp[i][buying];
        int hold=solve(i+1,buying,prices);

        if(buying==1){
            int buy=solve(i+1,0,prices)-prices[i];
            dp[i][buying]=Math.max(buy,hold);
        }
        else{
            int sell=solve(i+2,1,prices)+prices[i];
            dp[i][buying]=Math.max(sell,hold);
        }

        return dp[i][buying];

    }
    public int maxProfit(int[] prices) {
        dp= new int[prices.length+1][2];
        for(int i=0;i<prices.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,1,prices);
    }
}
