package leetCode;
//11 盛最多水的容器
public class code11 {

    public static void main(String[] args) {

        int[] nums = new int[]{1,8,6,2,5,4,8,3,7};

        getMostWater1(nums);

        getMostWater2(nums);

    }

    //双指针法
    private static void getMostWater2(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int max = 0;
        while (left<right){
            max = Math.max(max,Math.min(nums[left],nums[right])*(right-left));
            if (nums[left]>=nums[right]){
                right--;
            }else {
                left++;
            }
        }
        System.out.println(max);
    }




    //暴力破解法
    private static void getMostWater1(int[] nums) {
        int max = 0;
        for (int i = 0; i <nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                int y = Math.min(nums[i],nums[j]);
                int x = j-i;
                max = Math.max(max,x*y);
            }
        }
        System.out.println("result= "+ max);
    }

}
