class Solution {
    int ans=Integer.MAX_VALUE;
    public void solve(int i, int[] coins, int coin, int amount){
        if(i>=coins.length || coin>=ans){
            return;
        }

        if(amount==0){
            ans=Math.min(ans,coin);
            return;
        }

        if(coins[i]<=amount){
            solve(i,coins,coin+1,amount-coins[i]);
        }
        solve(i+1,coins,coin,amount);
    }
    public int coinChange(int[] coins, int amount) {
        solve(0,coins,0,amount);
        if(ans!=Integer.MAX_VALUE){
            return ans;
        }
        return -1;
    }
}
