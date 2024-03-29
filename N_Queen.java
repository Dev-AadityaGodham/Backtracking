/******************************************************************************

*******************************************************************************/
import java.util.*;
public class Main

{
    public void isSafe(int row,int col,char[][] board){
        
        //for horizonal
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        
        //for vertical
        for(int i=0;i<board[0].length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        
        //for upper left
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(board[r][c]='Q'){
                return false;
            }
        }
        
        //for upper right
        r=row;
        for(int c=col;c<board.length && r>=0;c++,r--){
            if(board[r][c]='Q'){
                return false;
            }
        }
        //lower left
        
        for(int c = col;col>=0 && r<board.length;r++,c--){
            if(board[r][c]='Q'){
                return false;
            }
        }
        for(int c=col;col<board.length && r<board.length ; c++;r++){
            if(board[r][c]='Q'){
                return false;
            }
        }
        return true;
    }
    public void saveBoard(char[][] board,List<List<String>> allBoards)
    
    public void helper(char[][] board,List<List<String>> allBoards,int col){
        if(col==board.length){
            saveBoard(board,allBoards);
            return;
        }
        for(int row=0;row<board.lenght;row++){
            if (isSafe(row,col,board)) {
                board[row][col]='Q';
                helper(board,allBoards,col+1);
                board[row][col]='.';
            }
            
        }
    }
	public List<List<String>> main(int n){
	    List<List<String>> allBoards = new ArrayList<>();
	    char [][] board = new board[n][n];
	    helper(board,allBoards,0);
	}
}
