class Solution {
    int[][] directions={{1,0},{0,1},{-1,0},{0,-1}};
    public void dfs(int r, int c, boolean[][] ocean , int[][] heights){
        int row= heights.length;
        int col= heights[0].length;
        ocean[r][c]= true;
        for(int[] dir : directions){
            int nr= r+dir[0];
            int nc= c+dir[1];

            if(nr>=0 && nr< row && nc>=0 && nc<col && !ocean[nr][nc] && heights[r][c]<=heights[nr][nc]){
                dfs(nr,nc,ocean,heights);
            }
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row= heights.length;
        int col= heights[0].length;

        boolean[][] pac= new boolean[row][col];
        boolean[][] atl= new boolean[row][col];

        for(int r=0;r<row;r++){
            dfs(r,0,pac,heights);
            dfs(r,col-1,atl,heights);
        }

        for(int c=0;c<col;c++){
            dfs(0,c,pac,heights);
            dfs(row-1,c,atl,heights);
        }
        List<List<Integer>> ans= new ArrayList<>();
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(pac[r][c] && atl[r][c]){
                    List<Integer> temp= new ArrayList<>();
                    temp.add(r);
                    temp.add(c);
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}
