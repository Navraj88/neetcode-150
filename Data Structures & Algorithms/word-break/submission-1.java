class Solution {
    int [][] dp;
    public int check(int i,int j,String s, List<String> wordDict){
        if(i==s.length()){
            return 1;
        }
        if(j==s.length()){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        String temp= s.substring(i,j+1);
        boolean flag= false;
        for(String st: wordDict){
            if(temp.equals(st)){
                flag= true;
                break;
            }
        }

        if(flag==true){
            dp[i][j]=Math.max(check(j+1,j+1,s,wordDict),check(i,j+1,s,wordDict));
            return dp[i][j];
        }
        
        dp[i][j]=check(i,j+1,s,wordDict);
        return dp[i][j];


    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        dp = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }   
        if(check(0,0,s,wordDict)==1){
            return true;
        }
        return false;
    }
}
