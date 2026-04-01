class Solution {
    public void permuteCalc(List<List<Integer>> ans, List<Integer> per,int[] vis,int[] nums, int n){
        if(per.size()==n){
            ans.add(new ArrayList(per));
        }
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                per.add(nums[i]);
                vis[i]=1;
                permuteCalc(ans,per,vis,nums,n);
                vis[i]=0;
                per.removeLast();
            }
        }
        return;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>per=new ArrayList<>();
        int n=nums.length;
        int[] vis= new int[n];
        permuteCalc(ans,per,vis,nums,n);
        return ans;
    }
}
