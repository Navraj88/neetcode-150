class Solution {
    int start=0;
    int maxlen=0;
    public void solve(int left,int right, String s){
        int n=s.length();
        
        while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){

            if(right-left+1>maxlen){
                start=left;
                maxlen=right-left+1;
            }
            left--;
            right++;
        }

        return;
    
    }
    public String longestPalindrome(String s) {
        if(s.length()<=2) return s;
        for(int i=0;i<s.length();i++){
            solve(i,i,s);
            solve(i,i+1,s);
        }

        return s.substring(start,start+maxlen);
    }
}
