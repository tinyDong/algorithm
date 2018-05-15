package algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class quickSort {
    public static void quickSortTest(Integer[] arr,Integer start,Integer end){
        if (start>end){
            return;
        }
        int i=start,j=end;
        int base = arr[start];
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
        swap(arr,start,i);
        quickSortTest(arr,start,i-1);
        quickSortTest(arr,i+1,end);

    }

    private static void swap(Integer[] arr, int i, int j) {
        int tmep=arr[i];
        arr[i]=arr[j];
        arr[j]=tmep;
    }

    public static void main(String[] args) {
        Integer[] testArr = new Integer[]{0, 1, 13, 25, 36, 17, 18, 2};
        quickSortTest(testArr,0,testArr.length-1);
        System.out.println(Arrays.toString(testArr));
    }
}
