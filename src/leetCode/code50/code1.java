package leetCode.code50;
//两数之和
//给定 nums = [2, 7, 11, 15], target = 9
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
public class code1 {

    public static void main(String[] args) {
        int[] nums =new int[]{2, 7, 11, 15};

        int i = 0 ;
        int j =nums.length - 1;
        int target = 9;
        while (i<j){
            int result =  nums[i] + nums[j];
            if (result==target){
                System.out.println("i="+i+"j"+j);
                return;
            }
            if (result>target){
                j--;
            }
            if (result<target){
                i++;
            }
        }
    }
}
