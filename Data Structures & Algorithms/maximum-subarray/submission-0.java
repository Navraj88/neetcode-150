class Solution {
    public int maxSubArray(int[] nums) {
        int maxans=nums[0];
        int curlimit=nums[0];

        for(int i=1;i<nums.length;i++){
            curlimit= Math.max(curlimit+nums[i],nums[i]);
            maxans= Math.max(maxans,curlimit);
        }

        return maxans;
    }
}
