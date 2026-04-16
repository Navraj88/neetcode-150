class Solution {
    public boolean check(int i,int j,String s, List<String> wordDict){
        if(i==s.length()){
            return true;
        }
        if(j==s.length()){
            return false;
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
            return check(j+1,j+1,s,wordDict) || check(i,j+1,s,wordDict);
        }
        
        return check(i,j+1,s,wordDict);

    }
    public boolean wordBreak(String s, List<String> wordDict) {
        return check(0,0,s,wordDict);
    }
}
