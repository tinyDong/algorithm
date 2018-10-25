package sort;

import java.util.PriorityQueue;

public class TopK {
//    http://www.cnblogs.com/en-heng/p/6336625.html
//https://blog.csdn.net/dingpiao190/article/details/73604718
//,5,101,8,2,99,102,103,101
    static int[] nums = new int[]{9,101, 11,1,109,2,4,  22, 99,102,103,104,8,14};
//    [1, 2, 4, 8, 9, 11, 14, 22, 99, 101, 102, 103, 104, 109]

    public static void main(String[] args) {
        int k = 5;
        int value1 = quickTopK(nums,0,nums.length-1,k-1);

        int value2 = heapTopk(nums,k);

        System.out.println(value1);
        System.out.println(value2);
    }



    public static int heapTopk(int[] arr, int k){

        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i]=arr[i];
        }
        for (int i = k/2-1; i >=0 ; i--) {
            heapAdjust(temp,i,k);
        }

        for (int i = k; i <arr.length ; i++) {
            int max = temp[0];
            if (arr[i]>max){
                temp[0]=arr[i];
                heapAdjust(temp,0,k);
            }
        }
        return temp[0];
    }



    // 堆调整
    private static void heapAdjust(int[] array, int s, int len) {
        for (int i = 2 * s+1; i < len; i = 2*i+1) {
            if (i+1<len&&array[i]>array[i+1]){
                i++;
            }
            if (array[i]<array[s]){
                swap(array,s,i);
                s=i;
            }
        }
    }





    private static int quickTopK(int[] arr,int start ,int end,int k) {
        int value = arr[k];
        int low = start;
        int high = end;
        while (low<high){
            while (low <high&&arr[low]>value){
                low++;
            }

            while (low<high&&arr[high]<value){
                high--;
            }
            if (low<high){
                swap(arr,low,high);
            }
        }
        if (k == low){
            return arr[k];
        }else if (k>low){
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

