package leetCode.code100;

//给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
//
//示例 1:
//
//输入:
//[
//[ 1, 2, 3 ],
//[ 4, 5, 6 ],
//[ 7, 8, 9 ]
//]
//输出: [1,2,3,6,9,8,7,4,5]
//示例 2:
//
//输入:
//[
//[1, 2, 3, 4],
//[5, 6, 7, 8],
//[9,10,11,12]
//]
//输出: [1,2,3,4,8,12,11,10,9,5,6,7]


public class code54 {
    public static void main(String[] args) {
//        int[][] nums = new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] nums = new int[][]{{1, 2, 3, 4},{5, 6, 7, 8},{9,10,11,12}};
        spiralOrder(nums);
    }

    public static void spiralOrder(int[][] matrix) {
        int tR = 0,tC =0;
        int dR = matrix.length-1;
        int dC = matrix[0].length-1;
        while (tC <= dC && tR <= dR){
            spiral(matrix,tR++,tC++,dR--,dC--);
        }
    }


    private static void spiral(int[][] nums, int tR, int tC, int dR, int dC) {
        if (tR==dR){
            for (int i = tC; i <=dC; i++) {
                System.out.println(nums[tR][i]+"");
            }
        }else if (tC == dC){
            for (int i = tR; i <dR ; i++) {
                System.out.println(nums[i][tC]);
            }
        }else {
            int curC = tC;
            int curR = tR;
            while (curC!=dC){
                System.out.println(nums[tR][curC]+"");
                curC++;
            }

            while (curR != dR){
                System.out.println(nums[curR][dC]+"");
                curR++;
            }

            while (curC != tC){
                System.out.println(nums[dR][curC]+"");
                curC--;
            }
            while (curR!=tR){
                System.out.println(nums[curR][tC]+"");
                curR--;
            }

        }
    }
}
