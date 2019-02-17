package jianzhioffer;

import java.util.ArrayList;

public class code42 {
    public static void main(String[] args) {
        System.out.println(FindNumbersWithSum(new int[]{1,2,3,4,5},7));
    }

    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int start = 0 ,end = array.length-1;
        int value = array[start] + array[end];
        while (value != sum){
            if (value>sum){
                end--;
            }else {
                start++;
            }
            value = array[start] + array[end];
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(start);
        res.add(end);
        return res;
    }
}
