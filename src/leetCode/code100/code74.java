package leetCode.code100;

//示例 1:
//
//输入:
//matrix = [
//[1,   3,  5,  7],
//[10, 11, 16, 20],
//[23, 30, 34, 50]
//]
//target = 3
//输出: true
//示例 2:
//
//输入:
//matrix = [
//[1,   3,  5,  7],
//[10, 11, 16, 20],
//[23, 30, 34, 50]
//]
//target = 13
//输出: false

public class code74 {
    public static void main(String[] args) {
        int[][] nums= new int[][]{{1,   3,  5,  7},{10, 11, 16, 20},{23, 30, 34, 50}};
        System.out.println(searchMatrix(nums,11));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int curC = matrix[0].length-1;
        int curR =0;

        while (curC>0&&curR<matrix.length){
            if (matrix[curR][curC]==target){
                return true;
            }else if (target > matrix[curR][curC]){
                curR++;
            }else {
                curC--;
            }
        }
        return false;
    }
}
