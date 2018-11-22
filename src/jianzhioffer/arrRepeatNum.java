package jianzhioffer;

//在一个长度为n的数组里的所有数字都在0到n-1的范围内。
//数组中某些数字是重复的，但不知道有几个数字是重复的。
//也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
//例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2
public class arrRepeatNum {

    public static void main(String[] args) {
        int[] arr =new int[]{2,3,1,0,2,5,3,5};

//        getRepeatNum1(arr);

        getRepeatNum2(arr);
    }

    private static void getRepeatNum2(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            while (arr[i]!=i){
                if (arr[i] == arr[arr[i]]){
                    System.out.println(arr[i]);
                    break;
                }
                swap(arr,i,arr[i]);
            }
        }

    }


    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private static void getRepeatNum1(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }


    }
}
