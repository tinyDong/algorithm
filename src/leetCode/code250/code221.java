package leetCode.code250;

//在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
public class code221 {
    public static void main(String[] args) {
        char[][] matrix=new char[][]{
                {'1' ,'0', '1', '0', '0'},
                {'1' ,'0', '1', '1', '1'},
                {'1' ,'1', '1', '1', '1'},
                {'1' ,'0', '1', '1', '0'}
        };

        System.out.println(maximalSquare(matrix));
    }

    public static int maximalSquare(char[][] matrix) {
        int m = matrix.length , n = matrix[0].length;
        int res = 0;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ( i==0 || j==0){
                    dp[i][j] = matrix[i][j] -'0';
                }else if (matrix[i][j] == '1'){
                    dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                }
                res = Math.max(res,dp[i][j]);
            }
        }
        return res*res;
    }
}
