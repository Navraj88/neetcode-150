class Solution {
    int[] row= {1,0,-1,0};
    int[] col= {0,1,0,-1};
    public int  find(int i, int j, int[][] grid, boolean[][] visited){
        int n= grid.length;
        int m=grid[0].length;
        int temp=1;
        for(int k=0;k<4;k++){
            int nr=i+row[k];
            int nc=j+col[k];
            if(nr>=0 && nc>=0 && nr<n && nc<m && !visited[nr][nc] && grid[nr][nc]==1){
                visited[nr][nc]=true;
                
                temp+=find(nr,nc,grid,visited);
            }
        }
        return temp;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n= grid.length;
        int m=grid[0].length;
        boolean[][] visited= new boolean[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    visited[i][j]=true;
                    ans=Math.max(ans,find(i,j,grid,visited));
                }
            }
        }
        return ans;
    }
}



