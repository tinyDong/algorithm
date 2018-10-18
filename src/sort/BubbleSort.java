package sort;

import java.util.Arrays;

public class BubbleSort {
    static int[] nums = new int[]{11,22,9,8,4,5,1,2};


    private static void bubbleSort(){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j <nums.length-i-1; j++) {
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    private static void insertSort(){
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            int value = nums[i];
            for (int j = i-1; j >=0; j--) {
                if (value<=nums[j]){
                    nums[j+1] = nums[j];
                    nums[j]=value;
                }
            }
        }
    }


    public static void main(String[] args) {
//        bubbleSort();
        insertSort();
        System.out.println( Arrays.toString(nums));
    }
}
