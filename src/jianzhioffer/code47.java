package jianzhioffer;

public class code47 {

    public static void main(String[] args) {
        System.out.println(Sum_Solution(5));
    }

    public static int Sum_Solution(int n) {
        if (n==0){
            return 0;
        }
       return n + Sum_Solution(n-1);
    }
}
