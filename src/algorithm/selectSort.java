package algorithm;

import java.util.*;

public class selectSort {
    public static Integer getMax(ArrayList<Integer> arrs){
        Integer[] arr= arrs.toArray(new Integer[arrs.size()]);
        Integer max = arr[0];
        for (int i =0 ;i<arr.length-1;i++){
            if (max<arr[i+1]){
                max=arr[i+1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(15);
        arr.add(11);
        arr.add(22);
        arr.add(20);
        ArrayList<Integer> newArr=new ArrayList<Integer>(arr.size());
        int size=arr.size();
        for (int i = 0;i<size;i++){
            Integer max=getMax(arr);
            System.out.println(max);
            newArr.add(max);
            arr.remove(max);
        }
        System.out.println(newArr);
    }
}
