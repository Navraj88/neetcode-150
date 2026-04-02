class Solution {
    public static int[][] dirs={{1,0},{0,1},{-1,0},{0,-1}};
    public boolean check(char[][] board, String word,boolean[][] vis,int idx, int i, int j){
        if(idx==word.length()){
            return true;
        }
        int n=board.length;
        int m=board[0].length;

        for(int[] d :dirs){
            int ni=i+d[0];
            int nj=j+d[1];
            if(ni>=0 && nj>=0 && ni<n && nj<m && !vis[ni][nj] && board[ni][nj]==word.charAt(idx)){
                vis[ni][nj]=true;
                if(check(board,word,vis,idx+1,ni,nj)){
                    return true;
                }
                vis[ni][nj]=false;
            }
        }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] vis= new boolean[n][m];
        int idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(idx)){
                    vis[i][j]=true;
                    if(check(board,word,vis,idx+1,i,j)){
                        return true;
                    }
                    vis[i][j]=false;
                }
            }
        }

        return false;
    }
}
