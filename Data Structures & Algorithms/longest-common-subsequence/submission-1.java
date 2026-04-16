class Solution {
    int[][] dp;
    public int solve(int m,int n, String s1,String s2){
        if(m<=0 || n<=0){
            return 0;
        }
        if(dp[m-1][n-1]!=-1) return dp[m-1][n-1];
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            dp[m-1][n-1]=1+solve(m-1,n-1,s1,s2);
        }
        else{
            dp[m-1][n-1]=Math.max(solve(m,n-1,s1,s2),solve(m-1,n,s1,s2));
        }
        return dp[m-1][n-1];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m= text1.length();
        int n= text2.length();
        dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(m,n,text1,text2);
    }
}
