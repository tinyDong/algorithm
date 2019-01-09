package leetCode.code150;

public class code136 {

    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};


    }

    public int singleNumber(int[] nums) {
        int single = 0;
        for(int i = 0;i < nums.length; i++){
            single = single ^ nums[i];
        }
        return single;
    }
}
