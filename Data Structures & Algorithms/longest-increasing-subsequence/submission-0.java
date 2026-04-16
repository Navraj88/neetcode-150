class Solution {
    public int solve(int i,int j ,int[] nums){
        if(j==nums.length){
            return 0; 
        }

        int res=0;
        if(i==-1 || nums[i]<nums[j]){
            res=1+solve(j,j+1,nums);
        }
        res=Math.max(res,solve(i,j+1,nums));
        return res;
    }
    public int lengthOfLIS(int[] nums) {
        return solve(-1,0,nums);
    }
}
