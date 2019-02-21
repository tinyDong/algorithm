package jianzhioffer;

import java.util.Arrays;

public class code51 {
// 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法
    public static void main(String[] args) {
        System.out.println(Arrays.toString(multiply(new int[]{1,2,3,4,5})));
    }

    public static int[] multiply(int[] A) {
        int length = A.length;

        int[] res = new int[length];
        res[0] = 1;
        for (int i = 1; i < length; i++) {
            res[i] = res[i-1] * A[i-1];
        }

        int temp = 1;
        for (int j = length -2; j >=0 ; j--) {
            temp = temp * A[j+1];
            res[j] = temp * res[j];
        }
        return res;
    }
}
