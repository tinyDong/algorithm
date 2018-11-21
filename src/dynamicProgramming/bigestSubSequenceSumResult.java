package dynamicProgramming;

//最长连续子序列和
public class bigestSubSequenceSumResult {

    //-2 6 -1 5 4 -7 2 3
    // sum  =10;
    //
    public static void main(String[] args) {
//        int[] arr = new int[]{-2,6,-1,5,4,-7,2,3};
//        getBigestSumResult(arr);

        int[] a={-2,6,-1,2,4,-7,2,3};


        System.out.println(maxSum1(a));

        System.out.println(maxSum2(a));

    }

    private static int maxSum2(int[] arr) {

        int max = 0;
        int current = 0;
        for (int i = 0; i <arr.length; i++) {
            current = current + arr[i];
            if (current<0){
                current=0;
            }
            if (current>max){
                max=current;
            }
        }
        return max;
    }


    private static int maxSum1(int[] arr) {
        int max = 0;
        for (int i = 0; i <arr.length; i++) {
            int currentValue=0;
            for (int j = i; j <arr.length ; j++) {
                currentValue = currentValue+arr[j];
                if (currentValue>max){
                    max=currentValue;
                }
            }
        }
        return max;
    }



}
