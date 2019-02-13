package jianzhioffer;

import java.util.HashMap;

public class code28 {
    public static void main(String[] args) {
        int[] nums =new int[]{1,2,3,2,2,2,5,4,2};

        System.out.println(MoreThanHalfNum_Solution(nums));
    }

    public static int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for (Integer i : array){
            if (map.containsKey(i)){
                Integer count = map.get(i);
                count++;
                map.put(i,count);
                if (count>array.length/2){
                    return i;
                }
            }else {
                map.put(i,1);
            }
        }
        return 0;
    }
}
