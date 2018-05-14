package algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class quickSort {
    public static void quickSortTest(int[] arr,Integer low,Integer high){
        if (low>high){
            return;
        }
        int i=low,j=high;
        int base=arr[low];
        while (i<j){
            while (i<j&&base<arr[j]){
                j--;
            }
            while (i<j&&base>=arr[i]){
                i++;
            }
            if (i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,i);
        quickSortTest(arr,low,i-1);
        quickSortTest(arr,i+1,high);
    }

    public static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
        int[] testArr = new int[]{ 3,36, 25, 10, 1, 18,17,  21};
        quickSortTest(testArr,0,testArr.length-1);
        System.out.println(Arrays.toString(testArr));
        //
    }
}
