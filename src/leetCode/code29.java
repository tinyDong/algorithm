package leetCode;

public class code29 {

//    示例 1:
//
//    输入: dividend = 10, divisor = 3
//    输出: 3
//    示例 2:
//
//    输入: dividend = 7, divisor = -3
//    输出: -2

//    例:29除以8，8扩大二倍，16小于29，再扩大二倍，超过29，于是29减去之前的16，返回值加上2。
//    第二次循环时因为此时的13小于8的二倍，故加上1，整个循环结束，最终结果为2+1=3，符合要求。
//    此外还要注意判断结果正负号时亦或的作用。
    public static void main(String[] args) {
        System.out.println(divide(29,3));
    }

    public static int divide(int dividend, int divisor) {

        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int res = 0;

        while (a>=b){
            int count =1,sum=b;
            while (sum+sum <a){
                sum = sum<<1;
                count = count<<1;
            }

            a = a - sum;
            res = count +res;
        }
        return (dividend<0&&divisor<0)||(dividend>0&&divisor>0)?res:-res;
    }






//    int divide(int dividend, int divisor) {
//        if (divisor == 0 || (dividend == INT_MIN && divisor == -1)) return INT_MAX;//因为带符号整数的范围为-2^n~2^n-1，故存在一种特殊情况
//
//        //取两数的绝对值
//        long long m = abs((long long)dividend), n = abs((long long)divisor), res = 0;
//        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;//注意此处异或的作用
//        if (n == 1) return sign == 1 ? m : -m;
//
//        while (m >= n) {
//            long long t = n, p = 1;
//            while (m >= (t << 1)) {
//                p <<= 1;
//                t <<= 1;
//            }
//            res += p;
//            m -= t;
//        }
//
//        return sign > 0 ? res : -res;
//
//
//
//    }


}
