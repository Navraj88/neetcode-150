class Solution {
    public boolean canPartition(int[] nums) {

        int sum = 0;
        for (int num : nums) sum += num;

        if (sum % 2 != 0) return false;
        int target = sum / 2;

        int n = nums.length;
        boolean[][] dp = new boolean[n + 1][target + 1];

        // base case
        dp[0][0] = true;

        for(int i=1;i<=n;i++){
            for(int s=0;s<=target;s++){
                dp[i][s]=dp[i-1][s];

                if(s>=nums[i-1]){
                    dp[i][s]= dp[i][s] || dp[i-1][s-nums[i-1]];
                }
            }
        }

        return dp[n][target];
    }
}