package jianzhioffer;

//求斐波那契数列的第 n 项
public class code10 {

    public static void main(String[] args) {


        int a =0 ;
        int b =1 ;
        //0 1 1 2 3 5
        int result =0;
        for (int i = 0; i <= 5; i++) {
            result = a+b;
            a=b;
            b=result;

        }

        System.out.println(result);

        System.out.println("====");

        System.out.println(getResult(7));

    }

    private static  int getResult(int n ){
        if (n <= 1)
            return n;
        int pre2 = 0, pre1 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = pre2 + pre1;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }
}
