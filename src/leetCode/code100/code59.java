package leetCode.code100;

import java.util.Arrays;

//给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
//
//示例:
//
//输入: 3
//输出:
//[
//[ 1, 2, 3 ],
//[ 8, 9, 4 ],
//[ 7, 6, 5 ]
//]
public class code59 {
    public static void main(String[] args) {

        int[][] res = generateMatrix(4);
        for (int[] nums : res){
            System.out.println(Arrays.toString(nums));
        }

    }

    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];

        int tr = 0,tc =0 ,dr = n-1,dc =n-1;
        generate(tr,tc,dr,dc,1,res);

        return res;
    }

    private static void generate(int tr, int tc, int dr, int dc, int index, int[][] res) {
        if (tc>dc){
            return;
        }

        if (tc==dc){
            res[dc][dr]=index;
            return;
        }
            int curR = tr;
            int curC = tc;
            while (curC<dc){
                res[tr][curC++] = index++;
            }

            while (curR<dr){
                res[curR][dc] = index++;
                curR++;
            }

            while (curC>tc){
                res[dr][curC--] = index++;
            }

            while (curR>tr){
                res[curR--][tc] =index++;
            }


        generate(tr+1,tc+1,dr-1,dc-1,index,res);
    }

}
