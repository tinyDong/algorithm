package jianzhioffer;

// 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
// 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
// 如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
public class code12 {

    public static void main(String[] args) {
        String str = "abtgcfcsjdeh";
        char[] chars = str.toCharArray();
//        Boolean exist = hasPath();
    }

//    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
//    {
//        int[] flag = new int[matrix.length];
//        for(int i = 0; i < rows; i ++){
//            for(int j = 0; j < cols; j ++){
//                if(helper(matrix, rows, cols, i, j, str, 0, flag)){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//    public static boolean helper(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
//        int index = i * cols + j;
//        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || flag[index] == 1) {
//            //下标不符合，index对应的值不为和字符数组中的不一致，或者该index已经被访问，这些情况只要有符合的就返回false
//            //只有上面的所有情况都不符合，也就是值相等，且没有访问过，下标不符合
//            return false;
//        }
//        if (k == str.length - 1) {
//            return true;
//        }
//        flag[index] = 1;
//        if (helper(matrix, rows, cols, i - 1, j, str, k + 1, flag)
//                || helper(matrix, rows, cols, i + 1, j, str, k + 1, flag)
//                || helper(matrix, rows, cols, i, j - 1, str, k + 1, flag)
//                || helper(matrix, rows, cols, i, j + 1, str, k + 1, flag)) {
//            return true;
//        }
//        flag[index] = 0;
//        return false;
//    }
}
