package leetCode.code250;

public class code215 {
    public static void main(String[] args) {

        int[] nums = new int[]{7,6,6,5,5,4,3,2,1};
        System.out.println(findKthLargest1(nums,2));
    }

    private static int findKthLargest1(int[] nums, int k){
            if (k==0){
                return 0;
            }
            int left = 0 ,right = nums.length-1;

            while (left<right){
                int pos = partition(nums,left,right);
                if (pos == k-1){
                    return nums[pos];
                }else if (pos > k-1){
                    right = pos-1;
                }else {
                    left = pos +1;
                }
            }
            return nums[left];
        }

        private static int partition(int[] nums , int start , int end){
            int pivot = nums[start];
            int left = start+1 ,right =end;
            while (left<=right){
                while (left<nums.length && nums[left]>=pivot){
                    left++;
                }
                while (right>0 && nums[right] <pivot){
                    right--;
                }

                if (left<right){
                    swap(nums,left++,right--);
                }
            }
            swap(nums,start,right);
            return right;
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
