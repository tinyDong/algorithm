package jianzhioffer;

import java.util.Arrays;

public class code13 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,11,7,8};
        reOrderArray1(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void reOrderArray1(int [] array) {
        int[] res = new int[array.length];
        int index =0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i]&1) ==1 ){
                res[index++] = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if ((array[i]&1) !=1 ){
                res[index++] = array[i];
            }
        }
        System.arraycopy(res, 0, array, 0, array.length);
    }


    public static void reOrderArray(int [] array) {
        int length = array.length;
        for(int i = 0; i < length; i ++){
            for(int j = length - 1; j > 0; j --){
                if(array[j] % 2 == 1 && array[j - 1] % 2 == 0){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
