package leetCode;

//实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
//
//如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
//
//必须原地修改，只允许使用额外常数空间。
//
//以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
//1,2,3 → 1,3,2
//3,2,1 → 1,2,3
//1,1,5 → 1,5,1
public class code31 {

//    public static void main(String[] args) {
//        int[] nums = new int[]{3,2,1};
//        nextPermutation(nums);
//        System.out.println(Arrays.toString(nums));
//    }
//    public static void nextPermutation(int[] nums) {
//        int pos1,pos2;
//        for(pos1=nums.length-1;pos1>0;pos1--)
//        {
//            if(nums[pos1]>nums[pos1-1])
//                break;
//        }
//
//        if(pos1==0){
//            reverse(nums,0,nums.length-1);  //[3,2,1,0]不存在下一个排列，直接反转
//        } else {
//
//            for(pos2=pos1;pos2<nums.length;pos2++)
//            {
//                if(nums[pos1-1]>=nums[pos2]) break;
//            }
//            swap(nums,pos1-1,pos2-1);
//            reverse(nums,pos1,nums.length-1);
//        }
//    }
//
//
//    public static void reverse(int[] nums,int l,int r)
//    {
//        while(l<r)
//        {
//            swap(nums,l,r);
//            l++;
//            r--;
//        }
//    }
//    public static void swap(int[] nums,int i,int j)
//    {
//        int temp=nums[i];
//        nums[i]=nums[j];
//        nums[j]=temp;
//    }
}
