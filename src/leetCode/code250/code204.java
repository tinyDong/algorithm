package leetCode.code250;

import java.util.Arrays;

public class code204 {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n) {
        if(n<=1){return 0;}
        int res =0;
        boolean[] prime = new boolean[n];
        Arrays.fill(prime,true);
        for (int i = 2; i < n; i++) {
            if (prime[i]){
                res++;
                for (int j = 2; i*j <n; j++) {
                    prime[i*j] = false;
                }
            }
        }
        return res;
    }
}
