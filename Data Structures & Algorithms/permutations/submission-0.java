class Solution {
    public void permuteCalc(List<List<Integer>> ans, List<Integer> per,int[] vis,int[] nums, int n){
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                per.add(nums[i]);
                vis[i]=1;
                permuteCalc(ans,per,vis,nums,n);
                vis[i]=0;
                per.removeLast();
            }
        }
        int flag=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            ans.add(new ArrayList(per));
            return;
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
