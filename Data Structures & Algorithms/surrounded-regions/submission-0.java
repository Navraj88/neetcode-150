class Solution {
    int[][] directions={{1,0},{0,-1},{0,1},{-1,0}};
    public void solve(char[][] board) {
        int row=board.length;
        int col=board[0].length;

        for(int r=0;r<row;r++){
            if(board[r][0]=='O'){
                dfs(r,0,board);
            }
            if(board[r][col-1]=='O'){
                dfs(r,col-1,board);
            }
        }
        for(int c=0;c<col;c++){
            if(board[0][c]=='O'){
                dfs(0,c,board);
            }
            if(board[row-1][c]=='O'){
                dfs(row-1,c,board);
            }
        }

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(board[r][c]=='#'){
                    board[r][c]='O';
                }
                else if(board[r][c]=='O'){
                    board[r][c]='X';
                }
            }
        }
    }

    public void dfs(int r, int c, char[][] board){
        int row=board.length;
        int col=board[0].length;

        board[r][c]='#';

        for(int[]dir : directions){
            int nr=dir[0]+r;
            int nc=dir[1]+c;
            if(nr>=0 && nr<row && nc>=0 && nc<col && board[nr][nc]=='O'){
                dfs(nr,nc,board);
            }
        }
    }
}
