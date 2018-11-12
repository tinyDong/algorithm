package Array;


import java.util.Arrays;

//给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
//你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用
//给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
public class ArrayTest {

    public static final int[] nums1=new int[]{1, 2};
    public static final int[] nums2=new int[]{3, 4};


    public static void main(String[] args) {
//        System.out.println(Arrays.toString(findTargetNumbers(nums,18)));
//        System.out.println(findMedianSortedArrays(nums1,nums2));
    }


//    给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。
//
//    请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。
//
//    示例 1:
//    你可以假设 nums1 和 nums2 不同时为空。
//    nums1 = [1, 3]
//    nums2 = [2]
//
//    中位数是 2.0
//    示例 2:
//    nums1 = [1, 2,3]
//    nums2 = [3, 4]
//
//    中位数是 (2 + 3)/2 = 2.5




//    int findMedian_logn(int vec1[], int n1, int vec2[], int n2)
//    {
//        int m1 = (n1-1) / 2, m2 = (n2-1) / 2;
//        if(n1 == 1)
//        {//递归结束条件
//            if(n2 == 1)
//                return vec1[0] < vec2[0] ? vec1[0] : vec2[0];
//            if(n2 % 2 == 0)
//            {
//                if(vec1[0] >= vec2[m2+1])
//                    return vec2[m2+1];
//                else if(vec1[0] <= vec2[m2])
//                    return vec2[m2];
//                else return vec1[0];
//            }
//            else
//            {
//                if(vec1[0] >= vec2[m2])
//                    return vec2[m2];
//                else if(vec1[0] <= vec2[m2-1])
//                    return vec2[m2-1];
//                else return vec1[0];
//            }
//        }
//        else if(n2 == 1)
//        {//递归结束条件
//            if(n1 % 2 == 0)
//            {
//                if(vec2[0] >= vec1[m1+1])
//                    return vec1[m1+1];
//                else if(vec2[0] <= vec1[m1])
//                    return vec1[m1];
//                else return vec2[0];
//            }
//            else
//            {
//                if(vec2[0] >= vec1[m1])
//                    return vec1[m1];
//                else if(vec2[0] <= vec1[m1-1])
//                    return vec1[m1-1];
//                else return vec2[0];
//            }
//        }
//        else
//        {
//            int cutLen = n1/2 > n2/2 ? n2/2 : n1/2;//注意每次减去短数组的一半，如果数组长度n是奇数，一半是指n-1/2
//            if(vec1[m1] == vec2[m2])return vec1[m1];
//            else if(vec1[m1] < vec2[m2])
//                return findMedian_logn(&vec1[cutLen], n1-cutLen, vec2, n2-cutLen);
//        else
//            return findMedian_logn(vec1, n1-cutLen, &vec2[cutLen], n2-cutLen);
//        }
//    }

    private static double findMidNum(int[] nums1) {
        double result = 0.0;
        if (nums1.length%2==0){
            result= (nums1[nums1.length/2] + nums1[nums1.length/2-1])/2.0;
        }else {
            result = nums1[nums1.length/2];
        }
        return result;
    }

    private static void merge(int[] nums1, int[] nums2, int[] temp) {
//        int low = 0 ;
//        int high = 0;
//        int k =0;
//        while (low<=nums1.length-1&&high<=nums2.length-1){
//            if (nums1[low]<=nums2[high]){
//                temp[k++]=nums1[low++];
//            }else {
//                temp[k++] = nums2[high++];
//            }
//        }
//        while (low<=nums1.length-1){
//            temp[k++]=nums1[low++];
//        }
//        while (high<= nums2.length-1){
//            temp[k++]=nums2[high++];
//        }
    }


    public static int[] findTargetNumbers(int[] arr,int target){

        int low =0,high =arr.length-1;

        while (low<high){
            int value = arr[low]+arr[high];
            if (value==target){
                return new int[]{low,high};
            }else if (value > target){
                high--;
            }else {
                low++;
            }
        }
        return null;
    }
}
