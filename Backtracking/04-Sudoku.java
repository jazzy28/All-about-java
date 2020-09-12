import java.util.*;

public class Main{
    public static void main(String[] args){
        int[][] board = {
              { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
              { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
              { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
              { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
              { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
              { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
              { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
              { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
              { 0, 9, 0, 0, 0, 0, 4, 0, 0 } 
            };
            
            //can't change non-zero values
            //change the values for zero
            sudoku(board, 0, 0);
    }
    public static void sudoku(int[][] board, int row, int col){
        if(row == 9){ //end of row
            for(int i = 0; i<9; i++){//print your board
               System.out.println(Arrays.toString(board[i]));
            }
            return;
        }//complete current row, go to next row
        if(col == 9){
            sudoku(board, row + 1, 0); //this means that, last col has ended, there will be fresh start, col = 0, row+1
            return;
        }
        
        //if current item is blank
        if(board[row][col] == 0){//neither row nor col has ended
        //processing or backtracking
            for(int i = 0; i<=9; i++){ //trying all the values from 1 to 9
                if(isSafe(board, row, col, i)){
                    board[row][col] = i;
                    sudoku(board, row, col + 1);
                    board[row][col] = 0; //backtrack
                }
            }
        } else{ //current value is not blank
            sudoku(board, row, col + 1);//col is full
        }
    }
    public static boolean isSafe(int[][] board, int row, int col, int value){ //value should not be repeated
        for(int c = 0; c < 9; c++){ //for a particular row, check columns
            if(board[row][c] == value){ //checking col
                return false;
            }
        }
        for(int r = 0; r<9; r++){ //checking row
            if(board[r][col] == value){
                return false;
            }
        }
        
        //check box: MAIN CODE
        int rowChunk = row/3; 
        int colChunk = col/3;
        
        for(int r = rowChunk*3; r<(rowChunk+1)*3; r++){ //0, 3, 6
            for(int c = colChunk*3; c<(colChunk+1)*3; c++){ //3, 6, 9
                if(board[r][c] == value){
                    return false;
                }
            }
        }
        
        return true;
    }
}
