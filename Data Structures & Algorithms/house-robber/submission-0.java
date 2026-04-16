class Solution {
    public int solve(int i, int[] nums){
        if(i>=nums.length){
            return 0;
        }
        
        int take=nums[i]+ solve(i+2,nums);
        int notTake= solve(i+1,nums);

        return Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        return solve(0,nums);
    }
}
