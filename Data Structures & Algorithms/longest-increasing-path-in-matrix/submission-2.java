class Solution {
    int[][] dp;
    int[] row={1,0,-1,0};
    int[] col={0,1,0,-1};
    public int solve(int i,int j,int[][] matrix){
        if(dp[i][j]!=0) return dp[i][j];
        int n=matrix.length;
        int m=matrix[0].length;
        for(int k=0;k<4;k++){
            int nr=row[k]+i;
            int nc=col[k]+j;
            if(nr>=0 && nc>=0 && nr<n && nc<m && matrix[nr][nc]>matrix[i][j]){
                dp[i][j]=Math.max(dp[i][j],1+solve(nr,nc,matrix));
            }
            
        }
        return dp[i][j];


    }
    public int longestIncreasingPath(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        dp=new int[n][m];
        int ans=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans=Math.max(ans,1+solve(i,j,matrix));
            }
        } 

        return ans;
    }
}
