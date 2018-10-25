package search;

public class SearchTest {

    static int[] nums = new int[]{1, 2, 4, 8, 9, 11, 14, 22, 99, 101, 102, 103, 104, 109};
    public static void main(String[] args) {

        System.out.println(twoSeparateCycle(nums,0,nums.length-1,11));
        System.out.println(twoSeparateRecursion(nums,0,nums.length-1,11));
    }

    public static int twoSeparateRecursion(int[] nums,int start,int end,int value){
        int mid = (start+end)/2;

        if (nums[mid]==value){
            return mid;
        }

        if (nums[mid]>value){
            return twoSeparateRecursion(nums,0,mid-1,value);
        }else {
            return twoSeparateRecursion(nums,mid+1,end,value);
        }
    }


    public static int twoSeparateCycle(int[] arr,int start,int end,int value){
        int result = 0;


        int mid = (start+end)/2;
        int low =start;
        int high = end;
        while (value!=arr[mid]){
            if (value>arr[mid]){
                low=mid;
            }else {
                high=mid;
            }
            mid=(low+high)/2;
        }

        return mid;
    }
}
