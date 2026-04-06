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
        int rowTrav=Math.max((n-row),(row-0));
        int colTrav=Math.max((n-col),(col-0));

        for(int i=1;i<=rowTrav;i++){
            if(row-i>=0 && board[row-i][col]=='Q'){
                return false;
            }
            if(row+i<n && board[row+i][col]=='Q'){
                return false;
            }
            if(row-i>=0 && col-i>=0 && board[row-i][col-i]=='Q'){
                return false;
            }
            if(row+i<n && col+i<n && board[row+i][col+i]=='Q'){
                return false;
            }
            if(row+i<n && col-i>=0 && board[row+i][col-i]=='Q'){
                return false;
            }
            if(row-i>=0 && col+i<n && board[row-i][col+i]=='Q'){
                return false;
            }
        }
        for(int i=1;i<=colTrav;i++){
            if(col-i>=0 && board[row][col-i]=='Q'){
                return false;
            }
            if(col+i<n && board[row][col+i]=='Q'){
                return false;
            }
        }
        return true;
    }
}
