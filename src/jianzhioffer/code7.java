package jianzhioffer;

public class code7 {
    public static void main(String[] args) {

        System.out.println(Fibonacci(7));
    }

    public static int Fibonacci(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if (n== 2){
            return 1;
        }
        int a = 1;
        int b = 1;
        int res =0;
        for (int i = 3; i <= n; i++) {
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }
}
