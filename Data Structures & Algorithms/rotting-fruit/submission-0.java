class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q= new ArrayDeque<>();
        int n= grid.length;
        int m=grid[0].length;
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        if(fresh==0) return 0;
        int steps=0;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while(fresh>0 && !q.isEmpty()){
            int length=q.size();
            for(int i=0;i<length;i++){

                int[] temp=q.poll();
                int r=temp[0];
                int c= temp[1];
                for(int[] dir: directions){
                    int row=r+dir[0];
                    int col=c+dir[1];
                    if(row>=0 && row<n && col>=0 && col<m && grid[row][col]==1){
                        grid[row][col]=2;
                        q.offer(new int[]{row,col});
                        fresh--;
                    }
                }
            }
            steps++;

        }

        return fresh==0 ? steps : -1;



    }
}
