package sort;

import java.util.Arrays;

public class partition {


    public static void main(String[] args) {
        int[] arr =new int[]{0,1,1,0,2,2,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void sort(int[] arr){
       int length = arr.length;
       int start = 0;
       int end = length-1;
       int current = 0;
       while (current<end){
           if (arr[current]<1){
               swap(arr,current,start);
               current++;
               start++;
           }else if (arr[current]>1){
               swap(arr,current,end);
               end--;
           }else {
               current++;
           }
       }

    }


    public static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
