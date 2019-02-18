package jianzhioffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class code45 {

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,2,5};
        System.out.println(isContinuous(nums));
    }

    public static boolean isContinuous(int [] numbers) {

        int catsCount =0;
        ArrayList<Integer> others = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==0){
                catsCount++;
            }else {
                others.add(numbers[i]);
            }
        }

        if (others.get(others.size()-1)  - others.get(0)>numbers.length - catsCount +1){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (Integer integer : others){
            if (!set.add(integer)){
                return false;
            }
        }
        return true;
    }
}
