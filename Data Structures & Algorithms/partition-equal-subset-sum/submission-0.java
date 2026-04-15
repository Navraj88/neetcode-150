class Solution {
    public boolean check(int i, int sum, int[] nums, int totalSum){
        if(sum==totalSum){
            System.out.println(sum+"   "+totalSum);
            return true;
        }
        if(i==nums.length){
            return false;
        }
        
        if(sum+nums[i]<=totalSum){
            return check(i+1,nums[i]+sum,nums,totalSum) || check(i+1,sum,nums,totalSum);
        }
        
        return check(i+1,sum,nums,totalSum);
        
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        return check(0,0,nums,sum/2);
    }
}
