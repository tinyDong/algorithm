package jianzhioffer;

public class code23 {

    public static void main(String[] args) {

//        TreeNode root = TreeUtils.stringToTreeNode("8,6,10,5,7,9,11");
        int[] nums = new int[]{5,7,6,9,11,10,8,1};
        System.out.println(VerifySquenceOfBST(nums));
    }

    public static boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length==0){
            return false;
        }
        return helper(sequence,0,sequence.length-1);
    }

    private static boolean helper(int[] sequence, int start, int end) {
        if (start>end){
            return true;
        }
        int rootValue = sequence[end];
        int index = start;
        while (sequence[index]<rootValue){
            index++;
        }

        for (int i = index; i < end; i++) {
            if (sequence[i]<rootValue){
                return false;
            }
        }

        return helper(sequence,start,index-1)&&helper(sequence,index,end-1);
    }
}
