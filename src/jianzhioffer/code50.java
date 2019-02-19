package jianzhioffer;

import java.util.HashSet;
import java.util.Set;

public class code50 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,0,2,5,3};
        System.out.println(duplicate(nums,1,new int[3]));
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
}
