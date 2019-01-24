package leetCode.code250;



public class code220 {
//    输入: nums = [1,2,3,1], k = 3, t = 0
//    输出: true
    public static void main(String[] args) {
        int[] nums = new int[]{1,5,9,1,5,9};
        int k =2,t =3;
        System.out.println(containsNearbyAlmostDuplicate(nums,k,t));
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > i; j--) {
                if (j-i<=k && Math.abs(nums[j]-nums[i])<=t){
                    return true;
                }
            }
        }
        return false;
    }
}
