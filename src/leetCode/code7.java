package leetCode;

public class code7 {

    public static void main(String[] args) {
        System.out.println(reverse(-100234));
    }

//    static void reverse(int a) {
//        int rs = 0;
//
//        while (a > 0) {
//            rs = rs* 10;
//            rs =rs + a % 10;
//            a = a/10;
//        }
//        System.out.println(rs);
//    }
    public static int reverse(int x) {
        if(x==Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        int res = 0;
        int num = Math.abs(x);
        while (num!=0){

            res = num%10 + res*10;
            num = num/10;
        }
        return x>0?res:-res;
    }









//       if (x == Integer.MIN_VALUE)
//            return Integer.MIN_VALUE;
//    int num = Math.abs(x);
//    int res = 0;
//        while (num != 0) {
//        if (res > Integer.MAX_VALUE) {
//            return x > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//        }
//        res = res * 10 + num % 10;
//        num = num/10;
//    }
//        return x > 0 ? res : -res;
}
