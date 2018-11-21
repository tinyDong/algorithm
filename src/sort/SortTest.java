package sort;

import java.util.Arrays;

//https://www.cnblogs.com/shen-hua/p/5424059.html
public class SortTest {
    static int[] nums = new int[]{9,101, 11,1,109,2,4,  22, 99,102,103,104,8,14};


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
//        quickSort(nums,0,nums.length-1);

//        mergeSort(nums,0,nums.length-1);

        heapSort(nums);

//        int k = 0;
//        for (int i = k+1; i < 10; i++) {
//            k= i+1;
//        }
        System.out.println( Arrays.toString(nums));
    }


    public static void heapSort(int []arr){
        int length = arr.length;
        for (int i = length/2-1; i >=0 ; i--) {
            adjustHeap(arr,i,length);
        }

        for (int i = length-1; i >=0 ; i--) {
            swap(arr,0,i);
            adjustHeap(arr,0,i);
        }

    }

    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     * @param arr
     * @param index
     * @param length
     */
    public static void adjustHeap(int []arr,int index,int length){
        for (int i = 2*index+1; i <length; i=2*index+1) {
            if (i+1<length&&arr[i+1]>arr[i]){
                i++;
            }
            if (arr[i]>arr[index]){
                swap(arr,i,index);
                index = i;
            }else {
                break;
            }
        }
    }



    private static void mergeSort(int[] arr, int start, int end) {
        int mid = (start+end)/2;
        if (start<end){
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }

    }


    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int tempIndex =0;
        int before = low;
        int after = mid+1;
        while (before<=mid&&after<=high){
            if (arr[before]<arr[after]){
                temp[tempIndex++] = arr[before++];
            }else {
                temp[tempIndex++] = arr[after++];
            }
        }
        while (before<=mid){
            temp[tempIndex++] = arr[before++];
        }

        while (after<=high){
            temp[tempIndex++] = arr[after++];
        }

        int x= 0;
        while (x<temp.length){
            arr[low+x]=temp[x];
            x++;
        }
    }










    public static void quickSort(int[] arr,int start ,int end){
      int value = arr[(start+end)/2];

      int low =start;
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
          quickSort(arr,start,low);
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
