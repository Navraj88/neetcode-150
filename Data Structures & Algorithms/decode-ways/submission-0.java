class Solution {
    
    private boolean isValid(String s) {
        int num = Integer.parseInt(s);
        return num >= 1 && num <= 26;
    }

    public int solve(int i,String s){
        if(i==s.length()){
            return 1;
        }
        if (s.charAt(i) == '0') return 0;
        int total=0;
        if(i<s.length()){
           total+=total+solve(i+1,s);
        }
        
        if (i + 1 < s.length() && isValid(s.substring(i, i + 2))) {
            total += solve(i + 2, s);
        }

        return total;
    }
    public int numDecodings(String s) {
        return solve(0,s);
    }
}
