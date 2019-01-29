package jianzhioffer;

public class code6 {


    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5,6,1,2};
        System.out.println(minNumberInRotateArray(nums));
    }

    public static int minNumberInRotateArray(int [] array) {
        if (array.length == 0) return 0;
        int left = 0, right = array.length-1;
        while (left<right){
            int mid = left + (right-left)/2;
            if (array[mid]>array[right]){
                left = mid+1;
            }else {
                right =mid;
            }
        }
        return array[left];
    }

}
