class Solution {
    public void generate(List<String>ans,StringBuilder temp,int left, int right, int n){
        if(left>n || right>n){
            return;
        }
        if(left==n && right==n){
            ans.add(temp.toString());
            return;
        }
        if(left==right){
            temp.append('(');
            generate(ans,temp,left+1,right,n);
            temp.deleteCharAt(temp.length() - 1);

        }
        else if(left>right){
            temp.append('(');
            generate(ans,temp,left+1,right,n);
            temp.deleteCharAt(temp.length() - 1);
            temp.append(')');
            generate(ans,temp,left,right+1,n);
            temp.deleteCharAt(temp.length() - 1);

        }
        return;
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans= new ArrayList<>();
        StringBuilder temp= new StringBuilder();
        generate(ans,temp,0,0,n);
        return ans;
    }
}
