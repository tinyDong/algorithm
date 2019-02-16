package jianzhioffer;

public class code40 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums){
            res = num^res;
        }
        return res;
    }
}
