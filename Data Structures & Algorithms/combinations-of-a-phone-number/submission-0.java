class Solution {
    public static String[] values= new String[8];
    public void find(List<String>ans, StringBuilder st, String digits, int idx){
        if(idx==digits.length()){
            ans.add(st.toString());
            return;
        }
        char dg=digits.charAt(idx);
        int digit=Character.getNumericValue(dg);
        String temp=values[digit-2];
        for(int i=0;i<temp.length();i++){
            st.append(temp.charAt(i));
            find(ans,st,digits,idx+1);
            st.deleteCharAt(st.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        StringBuilder st= new StringBuilder();
        List<String>ans= new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        values[0]="abc";
        values[1]="def";
        values[2]="ghi";
        values[3]="jkl";
        values[4]="mno";
        values[5]="pqrs";
        values[6]="tuv";
        values[7]="wxyz";
        
        find(ans,st,digits,0);
        return ans;
    }
}
