class Solution {
    int count=0;
    public void solve(int left,int right, String s){
        int n=s.length();
        
        while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){

            count++;
            left--;
            right++;
        }

        return;
    
    }
    public int countSubstrings(String s) {
        if(s.length()==1) return 1;
        for(int i=0;i<s.length();i++){
            solve(i,i,s);
            solve(i,i+1,s);
        }
        return count;
    }
}
