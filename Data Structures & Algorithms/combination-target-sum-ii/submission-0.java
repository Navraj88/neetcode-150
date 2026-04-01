class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        int n=candidates.length-1;
        backtrack(candidates,ans,temp,0,n,target);
        return ans;
    }
    public void backtrack(int[] nums,List<List<Integer>> ans,List<Integer>temp, int index ,int n, int target){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0 || index>n){
            return;
        }

        temp.add(nums[index]);
        backtrack(nums,ans,temp,index+1,n,target-nums[index]);

        temp.removeLast();

        while(index+1<=n){
            if(nums[index+1]==nums[index]){
                index++;
            }
            else{
                break;
            }
        }

        backtrack(nums,ans,temp,index+1,n,target);


    }
}
