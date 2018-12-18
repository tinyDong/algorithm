package leetCode.code100;

import java.util.Arrays;

public class code73 {

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(nums);

        for (int[] arr : nums){
            System.out.println(Arrays.toString(arr));
        }

    }

    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column  = matrix.length;
        boolean[] rowFlags = new boolean[row];
        boolean[] columnFlags = new boolean[row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] ==0){
                    rowFlags[i] = true;
                    columnFlags[i] = true;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            if (rowFlags[i]){
                for (int j = 0; j < column; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < column; i++) {
            if (columnFlags[i]){
                for (int j = 0; j < column; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
