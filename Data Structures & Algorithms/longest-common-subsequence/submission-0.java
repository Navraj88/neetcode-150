class Solution {
    public int solve(int m,int n, String s1,String s2){
        if(m<=0 || n<=0){
            return 0;
        }

        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return 1+solve(m-1,n-1,s1,s2);
        }

        return Math.max(solve(m,n-1,s1,s2),solve(m-1,n,s1,s2));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        return solve(text1.length(),text2.length(),text1,text2);
    }
}
