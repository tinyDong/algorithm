package leetCode;

//四数之和
//给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
//
//满足要求的四元组集合为：
//[
//[-1,  0, 0, 1],
//[-2, -1, 1, 2],
//[-2,  0, 0, 2]
//]
public class code18 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;

//        ArrayList<ArrayList<Integer>> result = fourSum(nums,target);
//        System.out.println(result);

    }

//    public static ArrayList<ArrayList<Integer>> fourSum(int[] numbers, int target) {
//        Arrays.sort(numbers);
//        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
//        dfs(ret, new ArrayList<Integer>(), numbers, 0, target);
//        return ret;
//    }
//
//    private static void dfs(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> condidate, int[] numbers, int curIndex,
//                     int target) {
//        // 以后求n数和，只要改这里就能解决，比如4改为3，改为5
//        if (condidate.size() == 4) {
//            int total = getSum(condidate);
//            if (total == target) {
//                ret.add(new ArrayList<>(condidate));
//            }
//            return;
//        }
//        if (curIndex > numbers.length - 1) {
//            return;
//        }
//        for (int i = curIndex; i < numbers.length; i++) {
//            // 如果是一样的数字，直接忽略，否则会有重复的答案
//            if (i != curIndex && numbers[i] == numbers[i - 1]) {
//                continue;
//            }
//            condidate.add(numbers[i]);
//            // 如果已经大于target，并且当前数字大于0，再循环加下去已经没有意义了，因为只会更大，直接return
//            if (getSum(condidate) > target && numbers[i] > 0) {
//                if (!condidate.isEmpty()) {
//                    condidate.remove(condidate.size() - 1);
//                }
//                return;
//            }
//            dfs(ret, condidate, numbers, i + 1, target);
//            if (!condidate.isEmpty()) {
//                condidate.remove(condidate.size() - 1);
//            }
//        }
//    }
//
//    private static int  getSum(ArrayList<Integer> condidate) {
//        int total = 0;
//        for (Integer num : condidate) {
//            total += num;
//        }
//        return total;
//    }

}
