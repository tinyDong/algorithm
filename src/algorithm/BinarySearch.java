package algorithm;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static Integer circleBinarySearch(Integer[] array ,Integer item){
        int start = 0;
        int end =array.length-1;
        while (start<end){
            int mid = (start + end)/2;
            if (array[mid]==item){
                return mid;
            }
            if (item < array[mid]){
                end=mid -1;
            }

            if (item > array[mid]){
                start=mid+1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Integer[] array=new Integer[]{1,2,4,6,8};
        System.out.println(Arrays.toString(array));
//        Integer result=recursionBinarySearchTest(array,0,array.length-1,11);
        Integer result=circleBinarySearch(array,16);
        System.out.println("result="+result);
    }

    public static Integer recursionBinarySearchTest(Integer[] arr,Integer start,Integer end,Integer target){

        if (start>=end){
            return null;
        }
        int mid= (start + end) / 2;
        System.out.println(mid);
        if (target==arr[mid]){
            return mid;
        }else if (target>arr[mid]){
            return recursionBinarySearchTest(arr,mid+1,end,target);
        }else if (target<arr[mid]){
            return recursionBinarySearchTest(arr,start,mid-1,target);
        }else {
            return null;
        }
    }
}
