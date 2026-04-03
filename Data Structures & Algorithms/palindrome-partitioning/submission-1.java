class Solution {
    public boolean isPalindrome(String s,int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public void check(List<List<String>>ans,List<String> temp,String s, int idx){
        if(idx==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                temp.add(s.substring(idx,i+1));
                check(ans,temp,s,i+1);
                temp.removeLast();
            }
        }

    }
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String> temp= new ArrayList<>();
        check(ans,temp,s,0);
        return ans;
    }
}
