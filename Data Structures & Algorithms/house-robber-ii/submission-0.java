class Solution {
    public int solve(int i, boolean flag, int[] nums){
        if(i>=nums.length){
            return 0;
        }
        int take=0,notTake=0;
        if(flag==true && i==nums.length-1){
            take=0;
            notTake=0;
        }
        else{
            notTake=solve(i+1,flag,nums);
            if(i==0) flag=true;
            take=nums[i]+ solve(i+2,flag,nums);
        }
        return Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        return solve(0,false,nums);
    }
}
