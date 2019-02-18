package jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class code45 {

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,2,0,4};
        System.out.println(isContinuous(nums));
    }

    public static boolean isContinuous(int [] numbers) {
        if (numbers.length==0){
            return false;
        }
        Arrays.sort(numbers);
        Set<Integer> set = new HashSet<>();

        ArrayList<Integer> others = new ArrayList<>();
        for (int number : numbers) {
            if (number != 0) {
                others.add(number);
                if (!set.add(number)){
                    return false;
                }
            }
        }

        int left = others.get(others.size()-1);
        int right =  others.get(0);
        return !(left - right>4);
    }
}
