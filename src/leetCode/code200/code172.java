package leetCode.code200;

//示例 1:
//
//输入: 3
//输出: 0
//解释: 3! = 6, 尾数中没有零。
//示例 2:
//
//输入: 5  10 9 8 7 6 5 4 3 2 1
//输出: 1
//解释: 5! = 120, 尾数中有 1 个零.
public class code172 {

    public static void main(String[] args) {
        System.out.println(trailingZeroes(10));
    }

    public static int trailingZeroes(int n) {
       int sum = 0;
       while (n > 0){
           n = n/5;
           sum =sum + n;

       }
       return sum;
    }
}
