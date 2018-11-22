package dynamicProgramming;


// ，从左上角开始每次只能向右或者向下走，最后到达右下角的位置，路径上所有的数字累加起来就是路径和，返回所有路径中最小的路径和。
//例子：
//给定m如下：
//1 3 5 9
//8 1 3 4
//5 0 6 1
//8 8 4 0
//路径1,3,1,0,6,1,0是所有路径中路径和最小的，所以返回11。

public class ShortestPath {

    public static void main(String[] args) {
        int[][] baseArr = buildArr();

        getShortestPath(baseArr,4,4);
    }

    private static void getShortestPath(int[][] baseArr,int m,int n) {
        int[][] dp = new int[m][n];

        for (int i = 1; i < m; i++) {
            dp[0][i]=dp[i - 1][0] + baseArr[0][i];
        }
        for (int i = 1; i < n; i++) {
            dp[i][0]=dp[0][i-1] + baseArr[i][0];
        }

        for (int i = 1; i <m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+baseArr[i][j];
            }
        }
        System.out.println(dp[m-1][n-1]);
    }


    private static int[][] buildArr() {
        return new int[][]{{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}};
    }

}
