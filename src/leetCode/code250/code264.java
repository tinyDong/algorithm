package leetCode.code250;


public class code264 {

    public static void main(String[] args) {

        System.out.println(nthUglyNumber(10));
    }

    public static int nthUglyNumber(int n) {
        // write your code here
        int[] res = new int[n];
        res[0] =1;
        int count =1;
        int index2=0 , index3=0,index5 =0;
        while (count<n){
            int min = Math.min(res[index2]*2,Math.min(res[index3]*3,res[index5]*5));
            if (min>=res[index2]*2){
                index2++;
            }
            if (min>=res[index3]*3){
                index3++;
            }
            if (min>=res[index5]*5){
                index5++;
            }
            res[count] = min;
            count++;
        }
        return res[n-1];
    }
}
