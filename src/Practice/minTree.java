package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class minTree {

    private static int[] prim(int[][] matrix) {
        int[] parents = new int[matrix.length];
        parents[0] = -1;

        ArrayList<Integer> reachedList = new ArrayList<>();
        reachedList.add(0);
        int from = 0 , to = 0;
        while (reachedList.size() < matrix.length){
            Integer weight = Integer.MAX_VALUE;
            for (Integer reached :reachedList) {
                for (int i = 0; i < matrix.length; i++) {
                    if (!reachedList.contains(i)&&matrix[reached][i]<weight){
                        weight = matrix[reached][i];
                        from = reached;
                        to = i;
                    }
                }
            }
            reachedList.add(to);
            parents[to] = from;
        }
        return parents;
    }


    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 4, 3, 100, 100},
                {4, 0, 8, 7, 0},
                {3, 8, 0, 100, 1},
                {100, 7, 100, 0, 9},
                {100, 100, 1, 9, 0}
        };
        int[] rparents = prim(matrix);
        System.out.println(Arrays.toString(rparents));
    }

}
