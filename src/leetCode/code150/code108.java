package leetCode.code150;

public class code108 {

    public static void main(String[] args) {
        int[] nums= new int[]{-10,-3,0,5,9};
        TreeNode res = sortedArrayToBST(nums);
        System.out.println(res);
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);

    }

    private static TreeNode helper(int[] nums, int start, int end) {
        if (start>end){
            return null;
        }
        if (start==end){
            return new TreeNode(nums[start]);
        }
        int mid = start+(end-start)/2;
        TreeNode root =new TreeNode(nums[mid]);
        root.left = helper(nums,start,mid-1);
        root.right = helper(nums,mid+1,end);
        return root;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
