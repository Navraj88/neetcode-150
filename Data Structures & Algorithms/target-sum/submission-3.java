class Solution {
    Integer[][] dp;
    int offset;

    public int solve(int i, int sum, int target, int[] nums) {
        if (i == nums.length) {
            return sum == target ? 1 : 0;
        }

        if (dp[i][sum + offset] != null) {
            return dp[i][sum + offset];
        }

        int add = solve(i + 1, sum + nums[i], target, nums);
        int sub = solve(i + 1, sum - nums[i], target, nums);

        return dp[i][sum + offset] = add + sub;
    }

    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for (int num : nums) total += num;

        offset = total;
        dp = new Integer[nums.length][2 * total + 1];

        return solve(0, 0, target, nums);
    }
}