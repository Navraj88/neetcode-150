class Solution {
    public int solve(int i,boolean buying ,int[] prices){

        if(i>=prices.length) return 0;

        int hold=solve(i+1,buying,prices);

        if(buying){
            int buy=solve(i+1,false,prices)-prices[i];
            return Math.max(buy,hold);
        }
        else{
            int sell=solve(i+2,true,prices)+prices[i];
            return Math.max(sell,hold);
        }

    }
    public int maxProfit(int[] prices) {
        return solve(0,true,prices);
    }
}
