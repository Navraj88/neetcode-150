class Solution {
    int dp[];
    private boolean isValid(String s) {
        int num = Integer.parseInt(s);
        return num >= 1 && num <= 26;
    }

    public int solve(int i,String s){
        if(i==s.length()){
            return 1;
        }
        if (s.charAt(i) == '0') return 0;

        if (dp[i]!= -1){
            return dp[i];
        }
        int total=0;
        if(i<s.length()){
           total+=total+solve(i+1,s);
        }
        
        if (i + 1 < s.length() && isValid(s.substring(i, i + 2))) {
            total += solve(i + 2, s);
        }
        dp[i]=total;
        return dp[i];
    }
    public int numDecodings(String s) {
        dp= new int[s.length()+1];
        Arrays.fill(dp,-1);
        return solve(0,s);
    }
}
