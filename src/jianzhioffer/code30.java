package jianzhioffer;

public class code30 {

    public static void main(String[] args) {
        int[] nums = new int[]{6,-3,-2,7,-15,1,2,2};
        System.out.println(FindGreatestSumOfSubArray(nums));
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        int sum = 0;
        for (Integer num : array){
            sum = sum + num;
            if (sum<0){
                sum = 0;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
