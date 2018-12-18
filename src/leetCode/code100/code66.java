package leetCode.code100;

import java.util.Arrays;

public class code66 {
    public static void main(String[] args) {
        int[] nums =new int[]{9,8,9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    public static int[] plusOne(int[] digits) {
       int n = digits.length;

        for (int i = n-1; i >=0; i--) {
            if (digits[i]<9){
                digits[i]= digits[i] +1;
                return digits;
            }
            digits[i]=0;
        }

        int[] res = new int[n+1];
        res[0] =1;
        return res;
    }
}
