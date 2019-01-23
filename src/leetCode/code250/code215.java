package leetCode.code250;

public class code215 {
    public static void main(String[] args) {

        int[] nums = new int[]{4,3,1,2,6,5};
        System.out.println(findKthLargest(nums,0));
    }

    public static int findKthLargest(int[] nums, int k) {
        if (k<0){
            return 0;
        }
        int[] heap = new int[k];
        System.arraycopy(nums,0,heap,0,k);

        for (int i = k/2-1; i >=0 ; i--) {
            buildHeap(heap,i,k);
        }

        for (int i = k; i <nums.length; i++) {
            int min = heap[0];
            if (nums[i]>min){
                heap[0] = nums[i];
                buildHeap(heap,0,k);
            }
        }
        return heap[0];
    }


    private static void buildHeap(int[] nums, int index, int length) {
        for (int i = 2*index+1; i <length; i = index * 2+1) {
            if (i+1<length && nums[i+1]<nums[i]){
                i++;
            }
            if (nums[i]<nums[index]){
                swap(nums,i,index);
                index=i;
            }else {
                break;
            }
        }
    }

    private static void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}
