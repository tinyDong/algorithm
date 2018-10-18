package sort;

import java.util.Arrays;

public class BubbleSort {
    static int[] nums = new int[]{8,3,9,4,5,1,2,11};


    private static void bubbleSort(){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j <nums.length-2; j++) {
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        bubbleSort();

        System.out.println( Arrays.toString(nums));
    }
}
