class Solution {
    public int solve(int s,int n){
        if(s==n){
            return 1;
        }
        int l=0;
        int r=0;
        if(s+1<=n){
            l=solve(s+1,n);
        }
        if(s+2<=n){
            r=solve(s+2,n);
        }
        return l+r;
    }
    public int climbStairs(int n) {
        return solve(0,n);
    }
}
