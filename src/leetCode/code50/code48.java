package leetCode.code50;

//给定 matrix =
//[
//[1,2,3],
//[4,5,6],
//[7,8,9]
//],
//
//原地旋转输入矩阵，使其变为:
//[
//[7,4,1],
//[8,5,2],
//[9,6,3]
//]

//给定 matrix =
//[
//[ 5, 1, 9,11],
//[ 2, 4, 8,10],
//[13, 3, 6, 7],
//[15,14,12,16]
//],
//
//原地旋转输入矩阵，使其变为:
//[
//[15,13, 2, 5],
//[14, 3, 4, 1],
//[12, 6, 8, 9],
//[16, 7,10,11]
//]

import java.util.Arrays;

public class code48 {

    public static void main(String[] args) {
//        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = new int[][]{{5, 1, 9,11},{2, 4, 8,10},{13, 3, 6, 7},{15,14,12,16}};
        rotate(matrix);
        System.out.println("=========");
        for (int i =0 ;i < matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

    }

    public static void rotate(int[][] nums) {

        int tR = 0;
        int tC = 0;
        int dR = nums.length-1;
        int dC = nums[0].length -1;
        while (tR<dR){
            rotateEdge(nums,tR++,tC++,dR--,dC--);
        }
    }

    private static void rotateEdge(int[][] nums, int tR, int tC, int dR, int dC) {

        int times = dC -tC;
        int temp = 0;
        for (int i = 0; i <times; i++) {
            temp = nums[tR][tC+i];
            nums[tR][tC+i] = nums[dR-i][tC];
            nums[dR-i][tC] = nums[dR][dC-i];
            nums[dR][dC-i] = nums[tR+i][dC];
            nums[tR+i][dC] = temp;
        }
    }

}
