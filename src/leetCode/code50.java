package leetCode;

//实现 pow(x, n) ，即计算 x 的 n 次幂函数。
//
//示例 1:
//
//输入: 2.00000, 10
//输出: 1024.00000
//示例 2:
//
//输入: 2.10000, 3
//输出: 9.26100
//示例 3:
//
//输入: 2.00000, -2
//输出: 0.25000
//解释: 2-2 = 1/22 = 1/4 = 0.25
public class code50 {

    public static void main(String[] args) {
        double x =2.10000 ;
        int n = 3;
        System.out.println(myPow(x,n));
    }

    private static double myPow(double x, int n) {
        if (n<0){
            return power(x,-n);
        }
        return power(x,n);
    }

    private static double power(double x, int n) {
        if (n==0){
            return 1;
        }
        double half = power(x,n/2);
        System.out.println(half);
        if (n%2==0){
            return half*half;
        }
        return x * half * half;
    }


//    private static double myPow(double x, int n) {
//        if (n < 0){
//            return 1 / power(x, -n);
//        }
//        return power(x, n);
//    }
//
//    private static double power(double x, int n) {
//        if (n == 0){
//            return 1;
//        }
//        double half = power(x, n / 2);
//        if (n % 2 == 0){
//            return half * half;
//        }
//        return x * half * half;
//    }
}
