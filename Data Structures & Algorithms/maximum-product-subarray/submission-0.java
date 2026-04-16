class Solution {

    public int maxProduct(int[] nums) {
        int gmax=nums[0];
        int tempmax=nums[0];
        for(int i=1;i<nums.length;i++){
            tempmax=Math.max(tempmax*nums[i],nums[i]);
            gmax=Math.max(gmax,tempmax);
        }
        return gmax;
    }
}
