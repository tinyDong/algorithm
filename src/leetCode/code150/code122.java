package leetCode.code150;

public class code122 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        int result = maxProfit(nums);
        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {

        int result = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i+1]>prices[i]){
                result = result + prices[i+1]-prices[i];
            }
        }
        return result;
    }
}
