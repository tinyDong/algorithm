package leetCode;

import java.util.HashSet;

public class code36 {

    public static void main(String[] args) {
        char[][] chars =new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };


        System.out.println(isValidSudoku(chars));
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> column = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();
            for (int j = 0; j < 9; j++) {

                if (board[i][j]!='.' && !column.add(board[i][j])){
                    return false;
                }

                if (board[j][i]!='.' && !row.add(board[j][i])){
                    return false;
                }

                int rowIndex = 3*(i/3) + j/3;
                int colIndex = 3*(i%3) + j%3;
                if (board[rowIndex][colIndex]!='.'&&!cube.add(board[rowIndex][colIndex])){
                    return false;
                }
            }

        }
        return true;
    }








//            for (int i = 0; i < 9; i++) {
//        HashSet<Character> row = new HashSet<>();
//        HashSet<Character> column = new HashSet<>();
//        HashSet<Character> cube = new HashSet<>();
//        for (int j = 0; j < 9; j++) {
//            // 检查第i行，在横坐标位置
//            if (board[i][j] != '.' && !row.add(board[i][j])){
//                return false;
//            }
//            // 检查第i列，在纵坐标位置
//            if (board[j][i] != '.' && !column.add(board[j][i])){
//                return false;
//            }
//            // 行号+偏移量
//            int RowIndex = 3 * (i / 3) + j / 3;
//            // 列号+偏移量
//            int ColIndex = 3 * (i % 3) + j % 3;
//            //每个小九宫格，总共9个
//            if (board[RowIndex][ColIndex] != '.' && !cube.add(board[RowIndex][ColIndex])){
//                return false;
//            }
//        }
//    }


}
