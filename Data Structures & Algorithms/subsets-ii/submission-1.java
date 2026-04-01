class Solution {
    public void subCalc(List<List<Integer>>ans, List<Integer>sub,int[]nums ,int index, int n){
        if(index==n){
            ans.add(new ArrayList(sub));
            return;
        }
        sub.add(nums[index]);
        subCalc(ans,sub,nums,index+1,n);
        sub.removeLast();

        while(index+1<n && nums[index]==nums[index+1] ){
            index++;
        }
        subCalc(ans,sub,nums,index+1,n);
        return;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>sub= new ArrayList<>();
        subCalc(ans,sub,nums,0,n);
        return ans;
    }
}
