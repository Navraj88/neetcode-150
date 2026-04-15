class Solution {
    Boolean[][] dp;
    public boolean check(int i, int sum, int[] nums, int target){
        if(sum==target){
            return true;
        }
        if(i==nums.length || sum>target){
            return false;
        }
        
        if(dp[i][sum]!=null) return dp[i][sum];

        dp[i][sum]= check(i+1,sum+nums[i],nums,target) || check(i+1,sum,nums,target); 
        
        
        return dp[i][sum];
        
    }
    public boolean canPartition(int[] nums) {
        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        int target=sum/2;
        dp= new Boolean[nums.length][target+1];
        return check(0,0,nums,target);
    }
}
