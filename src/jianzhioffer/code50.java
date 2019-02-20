package jianzhioffer;

import java.util.HashSet;
import java.util.Set;

public class code50 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,5,2,5,3};
        System.out.println(duplicate1(nums,1,new int[3]));
    }

    public static int duplicate(int numbers[],int length,int [] duplication) {
        Set<Integer> set = new HashSet<>();
        for (int number : numbers) {
            if (!set.add(number)) {
                return number;
            }
        }
        return -1;
    }


    public static int duplicate1(int numbers[],int length,int [] duplication) {
        for (int i = 0; i < numbers.length; i++) {
            while (i!=numbers[i]){
                if (numbers[i] == numbers[numbers[i]]){
                    return numbers[i];
                }
                swap(numbers,i,numbers[i]);
            }
        }
        return -1;
    }

    private static void swap(int[] array,int start,int end){
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }
}
