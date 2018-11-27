package jianzhioffer;

//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
//例如数组 {3, 4, 5, 1, 2} 为 {1, 2, 3, 4, 5} 的一个旋转，该数组的最小值为 1。
public class code11 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        int min = getMin(nums);
        System.out.println(min);
    }

    private static int getMin(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int start = 0;
        int end = nums.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if (nums[start]==nums[mid]&&nums[mid]==nums[end]){
                return minNumber(nums,start,end);
            }else if (nums[mid]<=nums[end]){
                end = mid;
            }else {
                start =mid+1;
            }
        }
        return nums[start];

    }

    private static int minNumber(int[] nums, int l, int h) {
        for (int i = l; i < h; i++){
            if (nums[i] > nums[i + 1])
                return nums[i + 1];
        }
        return nums[l];
    }
}
