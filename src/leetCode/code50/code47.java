package leetCode.code50;

//输入: [1,1,2]
//输出:
//[
//[1,1,2],
//[1,2,1],
//[2,1,1]
//]
public class code47 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
//        System.out.println(permute(nums));
    }

//    public static List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> res  = new ArrayList<>();
//        boolean[] flags = new boolean[nums.length];
////        dfs(res,new ArrayList<>(),nums,flags,0);
//        return res;
//    }


//    private  static void dfs(List<List<Integer>> result, List<Integer> empty, int[] nums, boolean[] flags, int cnt) {
//        if(cnt == nums.length){
//            result.add(new ArrayList<Integer>(empty));
//        }
//
//        for(int i = 0; i < flags.length; i++){
//            if(i > 0 && nums[i] == nums[i-1] && flags[i-1] == false){
//                continue;
//            }
//            if(flags[i] == false){
//                empty.add(nums[i]);
//                flags[i] = true;
//                dfs(result, empty, nums, flags, cnt+1);
//                flags[i] = false;
//                empty.remove(empty.size()-1);
//            }
//
//        }
//    }

}
