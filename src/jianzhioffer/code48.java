package jianzhioffer;
//https://www.cnblogs.com/ygj0930/p/6412875.html
public class code48 {

    public static void main(String[] args) {
        System.out.println(Add(3,5));
    }

    public static int Add(int a,int b) {
        int sum; //不含进位的和
        int add1; //进位

        while(b != 0)
        {
            sum = a^b;
            add1 = (a&b)<<1;
            a = sum;
            b = add1;
        }
        return a;

    }
}
