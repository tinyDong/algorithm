package sort;

import java.util.Arrays;

//https://www.cnblogs.com/shen-hua/p/5424059.html
public class SortTest {
    static int[] nums = new int[]{1,22,9,8,4,5,11,2};


    public static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
//        bubbleSort();
//        insertSort();
//        selectSort();
//        System.out.println(nums[1]);
        quickSort(nums,0,nums.length-1);
        System.out.println( Arrays.toString(nums));
    }




    public static void quickSort(int[] arr,int start ,int end){
        if (start>end){
            return;
        }
        int value = arr[(start+end)/2];
        int low = start;
        int high = end;
        while (low<high){
            while (low<high&&arr[low]<value){
                low++;
            }

            while (low<high&&arr[high]>value){
                high--;
            }

            if (low<high){
                swap(arr,low,high);
            }

            quickSort(arr,start,low-1);
            quickSort(arr,low+1,end);
        }
    }










    private static void bubbleSort(){
        int length = nums.length;
        for (int i = 0; i <length; i++) {
            for (int j = 0; j <length-i-1; j++) {
                if (nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
    }

    private static void insertSort(){
        int length = nums.length;

        for (int i = 1; i < length; i++) {
            int value = nums[i];
            int j = i-1;
            for (; j >=0; j--) {
                if (nums[j]>value){
                    nums[j+1]=nums[j];
                }else {
                    break;
                }
            }
            nums[j+1] = value;
        }
    }

    public static void selectSort(){
        int length = nums.length;

        for (int i = 0; i <length-1; i++) {
            int k =i;
            for (int j = k + 1; j <length; j++) {
                if (nums[k]>nums[j]){
                    k = j;
                }
            }
            swap(nums,i,k);
        }
    }
}
