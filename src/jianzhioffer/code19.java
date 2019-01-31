package jianzhioffer;

import java.util.ArrayList;

public class code19 {

    private static int cur =1;
    public static void main(String[] args) {
       int[][] matrix = new int[][]{
               {1,2,3,4},
               {5,6,7,8},
               {9,10,11,12},
               {13,14,15,16}
       };

        ArrayList<Integer> res = printMatrix(matrix);
        System.out.println(res.toString());
    }



    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        ArrayList<Integer> res = new ArrayList<>();
        int lr =0 ,lc = 0,rr = n-1,rc =n-1;
        while (lc<=rc){
            helper1(lr++,lc++,rr--,rc--,matrix,res);
        }
        return res;
    }

    private static void helper1(int lr, int lc, int rr, int rc,int [][] matrix,  ArrayList<Integer> res) {
        if (lr==rr&&lc==rc){
            res.add(matrix[lr][lc]);
        }
        int cC=lc, cR = lr;
        while (cC<rc){
            res.add(matrix[lr][cC++]);
        }
        while (cR<rr){
            res.add( matrix[cR++][rc]) ;
        }
        while (cC>lc){
            res.add( matrix[rr][cC--]);
        }

        while (cR>lr){
            res.add(matrix[cR--][lc]);
        }
    }


    private static int[][] generateMatrix(int n) {

        int[][] res =  new int[n][n];
        int lr =0 ,lc = 0,rr = n-1,rc =n-1;
        while (lc<=rc){
            helper(lr++,lc++,rr--,rc--,res);
        }
        return res;
    }

    private static void helper(int lr, int lc, int rr, int rc, int[][] res) {
        if (lr==rr&&lc==rc){
            res[lr][lc]=cur++;
        }
        int cC=lc, cR = lr;
        while (cC<rc){
            res[lr][cC++] =cur++;
        }
        while (cR<rr){
            res[cR++][rc] = cur++;
        }
        while (cC>lc){
            res[rr][cC--] = cur++;
        }

        while (cR>lr){
            res[cR--][lc] = cur++;
        }
    }
}
