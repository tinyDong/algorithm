package leetCode.code100;

//示例 1:
//输入: 4
//输出: 2
//示例 2:
//
//输入: 8
//输出: 2
//说明: 8 的平方根是 2.82842...,
//由于返回类型是整数，小数部分将被舍去。

public class code69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }

    static int mySqrt(int x) {
       if (x<=1){
           return x;
       }
       int left =0 , right = x;
       while (left < right){
           int mid = left + (right-left)/2;
           if (x/mid>=mid){
               left = mid+1;
           }else {
               right = mid;
           }
       }
       return right-1;
    }
}
