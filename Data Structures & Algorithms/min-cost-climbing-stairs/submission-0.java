class Solution {
    public int minCost(int i, int n, int costs,int[] cost ){
        if(i>=n){
            return costs;
        }

        return Math.min(minCost(i+1,n,costs+cost[i],cost),minCost(i+2,n,costs+cost[i],cost));

    }
    public int minCostClimbingStairs(int[] cost) {
       int n=cost.length;
       if(n==1){
            return cost[0];
       }
       return Math.min(minCost(0,n,0,cost),minCost(1,n,0,cost));
    }
}
