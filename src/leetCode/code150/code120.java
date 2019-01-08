package leetCode.code150;

import java.util.ArrayList;
import java.util.List;

public class code120 {

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> num1 =getNum1();
        List<Integer> num2 =getNum2();
        List<Integer> num3 =getNum3();
        List<Integer> num4 =getNum4();
        lists.add(num1);
        lists.add(num2);
        lists.add(num3);
        lists.add(num4);


        System.out.println(minimumTotal(lists));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle==null || triangle.size()==0){
            return 0;
        }
        int[] dp = new int[triangle.size()+1];
        for (int i = triangle.size()-1; i >=0 ; i--) {
            List<Integer> subList = triangle.get(i);
            for (int j = 0; j < subList.size(); j++) {
                dp[j] = Math.min(dp[j],dp[j+1]) + subList.get(j);
            }
        }
        return dp[0];
    }

    private static List<Integer> getNum1() {
        List<Integer> num1 =new ArrayList<>();
        num1.add(2);
        return num1;
    }
    private static List<Integer> getNum2() {
        List<Integer> num1 =new ArrayList<>();
        num1.add(3);
        num1.add(4);
        return num1;
    }
    private static List<Integer> getNum3() {
        List<Integer> num1 =new ArrayList<>();
        num1.add(6);
        num1.add(5);
        num1.add(7);
        return num1;
    }
    private static List<Integer> getNum4() {
        List<Integer> num1 =new ArrayList<>();
        num1.add(4);
        num1.add(1);
        num1.add(8);
        num1.add(3);
        return num1;
    }
}
