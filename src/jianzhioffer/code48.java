package jianzhioffer;
//https://www.cnblogs.com/ygj0930/p/6412875.html
public class code48 {

    public static void main(String[] args) {
        System.out.println(Add(4,5));
    }

    public static int Add(int a,int b) {
        int sum;
        int add1;
        while (b!=0){
            sum = a^b;
            add1 = (a&b)<<1;
            a = sum;
            b = add1;
        }
        return a;
    }
}
