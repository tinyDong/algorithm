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


        System.out.println(MaxSum1(a));

        System.out.println(MaxSum0(a));

    }

    private static int MaxSum1(int[] arr){
        int maxSum=0;
        int start = 0,end = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum = currentSum + arr[j];
                if (currentSum>maxSum){
                    maxSum =currentSum;
                    start = i;
                    end =j;
                }
            }
        }
        System.out.println("i==="+start+"j====="+end);;
        return maxSum;
    }

    public static int maxSubsequenceSum(int[] a, int left, int right) {
        if(left == right) { //Base case
            if(a[left] > 0) {
                return a[left];
            } else {
                return 0; //保证最小值为0
            }
        }

        int center = (left+right)/2;
        int maxLeftSum = maxSubsequenceSum(a, left, center); //递归调用，求左部分的最大和
        int maxRightSum = maxSubsequenceSum(a, center+1, right);//递归调用，求右部分的最大和

        int leftBorderSum = 0, maxLeftBorderSum = 0;//定义左边界子序列的和
        for(int i=center; i>=left; i--) {//求左边界的最大和（从右边开始往左求和）
            leftBorderSum += a[i];
            if(leftBorderSum > maxLeftBorderSum) {
                maxLeftBorderSum = leftBorderSum;
            }
        }

        int rightBorderSum = 0, maxRightBorderSum = 0;//定义右边界子序列的和
        for(int i=center+1; i<=right; i++) {//求右边界的最大和（从左边开始往右求和）
            rightBorderSum += a[i];
            if(rightBorderSum > maxRightBorderSum) {
                maxRightBorderSum = rightBorderSum;
            }
        }

        //选出这三者中的最大值并返回（max3(int a, int b, int c)的实现没有给出）
        System.out.println(maxLeftSum+":"+maxRightSum+":"+maxLeftBorderSum + maxRightBorderSum);
//        return max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);
        return 0;
    }


    private static int MaxSum0(int[] arr) {
//
        int maxSum =0;
        int currentSum=0;

        for (int i = 0; i <arr.length; i++) {
            currentSum = arr[i]+currentSum;
            if (currentSum>maxSum){
                maxSum = currentSum;
            }

            if (currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }


}
