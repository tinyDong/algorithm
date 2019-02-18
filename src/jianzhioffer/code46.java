package jianzhioffer;

import java.util.Arrays;

public class code46 {
    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(5,2));
    }

    public static int LastRemaining_Solution(int n, int m) {

        int outCount = 0;
        boolean[] visted = new boolean[n+1];
        Arrays.fill(visted,false);
        int outIndex = m-1;
        while (outCount!=n){
            outCount++;

            while (visted[outIndex]){
                outIndex ++;
                outIndex = outIndex%n;
            }

            visted[outIndex] = true;

            outIndex = outIndex%n;

            while (visted[(outIndex +1)%n]){
                outIndex++;
                outIndex = outIndex%n;
            }
            outIndex = outIndex + m-1;
            outIndex = outIndex%n;
        }
        for (int i = 0; i < n; i++) {
            if (!visted[i]){
                return i+1;
            }
        }
        return -1;
    }

}
