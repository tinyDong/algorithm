package leetCode.code300;

public class code313 {

//    输入: n = 12, primes = [2,7,13,19]
//    输出: 32
//    解释: 给定长度为 4 的质数列表 primes = [2,7,13,19]，前 12 个超级丑数序列为：[1,2,4,7,8,13,14,16,19,26,28,32] 。
    public static void main(String[] args) {

        System.out.println(nthSuperUglyNumber(12,new int[]{2,7,13,19}));
    }

    public static int nthSuperUglyNumber(int n, int[] primes) {

        int[] res = new int[n];
        res[0] =1;
        int count = 1;
        int index2 =0 , index7 =0 , index13 =0 , index19 =0 ;
        while (count<n){
            int min = Math.min(Math.min(res[index2]*2,res[index7]*7),Math.min(res[index13]*13,res[index19]*19));
            if (res[index2]*2<=min){
                index2++;
            }
            if (res[index7]*7<=min){
                index7++;
            }
            if (res[index13]*13<=min){
                index13++;
            }
            if (res[index19]*19<=min){
                index19++;
            }
            res[count] = min;
            count++;
        }
        return res[n-1];
    }
}
