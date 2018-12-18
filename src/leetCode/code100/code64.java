package leetCode.code100;

//输入:
//[
//[1,3,1],
//[1,5,1],
//[4,2,1]
//]
//输出: 7
//解释: 因为路径 1→3→1→1→1 的总和最小。

public class code64 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(nums));
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
