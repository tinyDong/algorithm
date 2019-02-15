package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

public class code32 {


    public static void main(String[] args) {
        int[] nums = new int[]{3 ,32,321};

        System.out.println(PrintMinNumber(nums));
    }

    public static String PrintMinNumber(int [] numbers) {
        List<Integer> list = new ArrayList<>();

        for (Integer integer : numbers){
            list.add(integer);
        }

        list.sort((o1, o2) -> (o1.toString()+o2.toString()).compareTo(o2.toString()+o1.toString()));
        StringBuilder sb = new StringBuilder();
        for (Integer integer : list){
            sb.append(integer);
        }
        return sb.toString();
    }


}
