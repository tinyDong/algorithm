package leetCode.code100;

//给定一个二维网格和一个单词，找出该单词是否存在于网格中。
//单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
//
//示例:
//
//board =
//[
//['A','B','C','E'],
//['S','F','C','S'],
//['A','D','E','E']
//]
//
//给定 word = "ABCCED", 返回 true.
//给定 word = "SEE", 返回 true.
//给定 word = "ABCB", 返回 false.


public class code79 {

    public static void main(String[] args) {
        char[][] chars = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word ="ABCB";

        System.out.println(exist(chars,word));
    }

    private static boolean exist(char[][] chars, String word) {
        int row = chars.length;
        int column = chars[0].length;
        boolean[][] visted = new boolean[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (helper(i,j,0,chars,visted,word)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean helper(int curR, int curC, int index, char[][] chars, boolean[][] visted, String word) {

        if (index==word.length()){
            return true;
        }
        int row = chars.length;
        int column = chars[0].length;
        if (curC<0||curR<0||curC>=column||curR>=row||visted[curR][curC]||word.charAt(index)!=chars[curR][curC]){
            return false;
        }
        visted[curR][curC] = true;
        boolean res = helper(curR+1,curC,index+1,chars,visted,word)||
                helper(curR,curC+1,index+1,chars,visted,word)||
                helper(curR-1,curC,index+1,chars,visted,word)||
                helper(curR,curC-1,index+1,chars,visted,word);
        visted[curR][curC] = false;
        return res;
    }
















//    public static boolean exist(char[][] board, String target) {
//        int row = board.length;
//        int column = board[0].length;
//        boolean[][] visted = new boolean[row][column];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                if (search(board,target,0,i,j,visted)){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    private static boolean search(char[][] board, String target, int index, int row, int column, boolean[][] visted) {
//        if (index==target.length()){
//            return true;
//        }
//        int m = board.length, n = board[0].length;
//        if (row < 0 || column < 0 || row >= m || column >= n || visted[row][column] || board[row][column] != target.charAt(index)){
//            return false;
//        }
//        visted[row][column] = true;
//
//        boolean res  = search(board,target,index+1,row-1,column,visted)||
//                search(board,target,index+1,row,column-1,visted)||
//                search(board,target,index+1,row+1,column,visted)||
//                search(board,target,index+1,row,column+1,visted);
//        visted[row][column] = false;
//        return res;
//    }

}
