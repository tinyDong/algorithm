package jianzhioffer;
//https://blog.csdn.net/zl18310999566/article/details/80224147
public class code33 {
    public static void main(String[] args) {

//        System.out.println(nthUglyNumber(10));
    }
//    public static int nthUglyNumber(int n) {
//
//        int[] num = new int[n];
//        num[0] = 1;
//        int index2 = 0,index3 = 0,index5 = 0;
//        int[] result=new int[n];
//        result[0]=1;
//
//        int begin = 1;
//        while(begin<n){
//            result[begin]=Math.min(result[index2]*2,Math.min(result[index3]*3,result[index5]*5));
//            if(result[begin]==result[index2]*2)
//                index2++;
//            if(result[begin]==result[index3]*3)
//                index3++;
//            if(result[begin]==result[index5]*5)
//                index5++;
//            begin++;
//        }
//        return result[--begin];
//    }


    public static int GetUglyNumber_Solution(int index) {

        int num = 0;
        int uglyCount = 0;
        while (uglyCount<index){
            num++;
            if (isUgly(num)){
                uglyCount++;
            }
        }
        return num;
    }

    private static boolean isUgly(int num) {
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }

        return num==1;
    }
}
