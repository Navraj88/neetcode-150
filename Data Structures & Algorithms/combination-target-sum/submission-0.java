class Solution {
    public void combFinder(int[] nums, int index, int n, List<List<Integer>> ans, List<Integer> comb,int target){
        if(index>n && target==0){
            ans.add(new ArrayList(comb));
        }
        if(index>n){
            return;
        }

        if(target>=nums[index]){
            comb.add(nums[index]);
            combFinder(nums,index,n,ans,comb,target-nums[index]);
            comb.removeLast();
            combFinder(nums,index+1,n,ans,comb,target);         
        }
        else{
            combFinder(nums,index+1,n,ans,comb,target);         
        }

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        int n=nums.length-1;
        combFinder(nums,0,n,ans,comb,target);
        return ans;
    }
}
