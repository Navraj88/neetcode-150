class Solution {
    
    public int solve(int i,int sum,int target,int[] nums){
        if(i==nums.length){
            return sum==target ? 1:0;
        }

        return solve(i+1,sum+nums[i],target,nums)+solve(i+1,sum-nums[i],target,nums);
    }
    public int findTargetSumWays(int[] nums, int target) {
        return solve(0,0,target,nums);
    }
}
