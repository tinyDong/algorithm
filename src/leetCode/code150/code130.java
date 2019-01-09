package leetCode.code150;

import java.util.Arrays;

public class code130 {


    public static void main(String[] args) {

        char[][] chars = new char[][]{
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}};

        solve(chars);
        for (char[] subChars: chars){
            System.out.println(Arrays.toString(subChars));
        }
    }

    public static void solve(char[][] board) {

        if (board == null || board.length ==0){
            return;
        }
        int row = board.length;
        int column = board.length;
        for (int i = 0; i <column; i++) {
            dfs(board,i,0);
            dfs(board,i,column-1);
        }

        for (int i = 0; i < row; i++) {
            dfs(board,0,i);
            dfs(board,column-1,i);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (board[i][j] == '-'){
                    board[i][j] = 'O';
                }else {
                    board[i][j]='X';
                }
            }
        }
    }

    private static void dfs(char[][] board, int row, int column) {
        if (row<0||column<0 ||row>=board.length||column>=board.length || board[row][column]!='O'){
            return;
        }
        board[row][column] = '-';
        dfs(board,row+1,column);
        dfs(board,row,column+1);
        dfs(board,row,column+1);
        dfs(board,row,column-1);
    }


}
