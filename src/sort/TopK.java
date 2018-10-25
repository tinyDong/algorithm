package sort;

import java.util.PriorityQueue;

public class TopK {
//    http://www.cnblogs.com/en-heng/p/6336625.html
//https://blog.csdn.net/dingpiao190/article/details/73604718
//,5,101,8,2,99,102,103,101
    static int[] nums = new int[]{1,2,4, 9,101, 11, 109,22, 99,102,103,104,8,14};
//    [1, 2, 4, 9, 11, 22, 99, 101, 102, 103]

    public static void main(String[] args) {
        int k = 3;
        int index = nums.length-3;
        int value = quickTopK(nums,0,nums.length-1,index);
        System.out.println(value);
    }

    private static int quickTopK(int[] arr,int start ,int end,int k) {
        int value = arr[k];
        int low = start;
        int high = end;
        while (low<high){
            while (low <high&&arr[low]<value){
                low++;
            }

            while (low<high&&arr[high]>value){
                high--;
            }
            if (low<high){
                swap(arr,low,high);
            }
        }
        if (k == low+1){
            return arr[k];
        }else if (k>low+1){
            return quickTopK(arr,low+1,end,k);
        }else {
            return quickTopK(arr,start,low-1,k);
        }
    }





    public static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

