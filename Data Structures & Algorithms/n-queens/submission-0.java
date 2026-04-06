class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>>ans= new ArrayList<>();
        placeQueen(ans,board,n,0);
        return ans;
    }
    public void placeQueen(List<List<String>>ans,char[][] board,int n, int row){
        if(row==n){
            List<String>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }

        for(int col=0;col<n;col++){
            if(isSafe(board,row,col,n)){
                board[row][col]='Q';
                placeQueen(ans,board,n,row+1);
                board[row][col]='.';
            }
        }
        return;

    }

    public boolean isSafe(char[][] board, int row,int col , int n){

        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        
        for(int r=0;r<row;r++){
            int diff= row-r;
            int c1= col-diff;
            int c2= col+diff;

            if(c1>=0 && board[r][c1]=='Q') return false;
            if(c2<n && board[r][c2]=='Q') return false;

        }

       
        return true;
    }
}
