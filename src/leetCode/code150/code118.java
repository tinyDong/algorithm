package leetCode.code150;

import java.util.ArrayList;
import java.util.List;

public class code118 {
    public static void main(String[] args) {
        List<List<Integer>> res = generate(5);
        for (List<Integer> item :res){
            System.out.println(item);
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int[][] temp = new int[numRows][numRows];

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> subList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (i==j || j ==0){
                    temp[i][j] = 1;
                }else {
                    temp[i][j] = temp[i-1][j] + temp[i-1][j-1];
                }
                subList.add(temp[i][j]);
            }
            res.add(subList);
        }
        return res;
    }
}
