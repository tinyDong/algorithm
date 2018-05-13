package algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class quickSort {
    public static void quickSortTest(Integer[] arr,Integer start,Integer end){
        System.out.println("result="+Arrays.toString(arr));
        int base=arr[start];
        int i =start;
        int j =end;
        if (j>i){
            while (arr[i]<base&&i<end){
                i++;
            }
            while (base<arr[j]&&j>start){
                j--;
            }
            if (i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }

            if (i<end){
                quickSortTest(arr,i+1,end);
            }

            if (j>start){
                quickSortTest(arr,start,j-1);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] testArr = new Integer[]{0, 1, 13, 25, 36, 17, 18, 2};
        quickSortTest(testArr,0,testArr.length-1);
        System.out.println(Arrays.toString(testArr));
    }
}
