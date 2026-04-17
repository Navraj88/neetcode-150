class Solution {
    // public int solve(int i,int j ,int[] nums){
    //     if(j==nums.length){
    //         return 0; 
    //     }
    //     if(dp[i+1][j]!=-1) return dp[i+1][j];
    //     int res=0;
    //     if(i==-1 || nums[i]<nums[j]){
    //         res=1+solve(j,j+1,nums);
    //     }
    //     dp[i+1][j]=Math.max(res,solve(i,j+1,nums));
    //     return dp[i+1][j];
    // }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,1);
        int maxlen=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
            maxlen=Math.max(maxlen,dp[i]);
        }
        return maxlen;
    
    }
}
