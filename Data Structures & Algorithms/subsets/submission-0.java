class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public void subsetBuilder(int[] nums, int index,int n,List<Integer>sub){
        if(index>n){
            ans.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[index]);
        subsetBuilder(nums,index+1,n,sub);
        sub.removeLast();
        subsetBuilder(nums,index+1,n,sub);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>sub= new ArrayList<>();
        int n=nums.length;
        subsetBuilder(nums,0,n-1,sub);
        return ans;
    }
}