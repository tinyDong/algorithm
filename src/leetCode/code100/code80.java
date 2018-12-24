package leetCode.code100;

import java.util.Arrays;

//给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
//
//不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
//
//示例 1:
//
//给定 nums = [1,1,1,2,2,3],
//
//函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。
//
//你不需要考虑数组中超出新长度后面的元素。
//示例 2:
//
//给定 nums = [0,0,1,1,1,1,2,3,3],
//
//函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。
//
//你不需要考虑数组中超出新长度后面的元素。
public class code80 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};

        System.out.println(removeDuplicates1(nums,2));
        System.out.println(Arrays.toString(nums));

    }

    public static int removeDuplicates1(int[] nums,int length) {
        int count =0 ;
        int pre = 0;
        int cur = 0;
        while (cur < nums.length){
            if (nums[pre]==nums[cur]&&count < length){
                nums[pre+count] = nums[cur];
                count++;
                cur++;
            }else {
               if (nums[cur] == nums[cur-1] ){
                    cur++;
                }else {
                    pre = pre+count;
                    count=1;
                    nums[pre] = nums[cur];
                    cur++;
                }
            }
        }
        return pre+count;
    }


    public static int removeDuplicates(int[] nums) {
//        int cur = 1;
//        int pre = 0;
//        int count = 1;
//        while (cur<nums.length){
//            if (nums[pre] == nums[cur] && count==0){
//                cur++;
//            }else {
//                if (nums[pre] == nums[cur]){
//                    count--;
//                }else {
//                    count=1;
//                }
//                nums[++pre] = nums[cur++];
//            }
//        }
//
//      return pre+1;
        return 0;
    }


}
