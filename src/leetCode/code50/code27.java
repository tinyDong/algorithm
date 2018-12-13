package leetCode.code50;

//给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
//
//不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
//
//元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素

//给定 nums = [3,2,2,3], val = 3,
//
//函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
//
//你不需要考虑数组中超出新长度后面的元素。
public class code27 {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int length = removeElement(nums,3);
        System.out.println(length);
        System.out.println("-======");

        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeElement(int[] nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != target){
                nums[res] = nums[i];
                res ++;
            }
        }
        return res;
    }
}
