package leetCode.code100;


public class code62 {

    public static void main(String[] args) {
        System.out.println(uniquePaths1(3,7));
    }

    public static int uniquePaths2(int m, int n) {
        int[] res =new int[]{0};
        dfs(1,1,m,n,res);
        return res[0];
    }

    private static void dfs(int row, int column, int Trow, int Tcolumn, int[] res) {
        if (row==Trow && column ==Tcolumn){
            res[0]= res[0]+1;
            return;
        }

        if (row+1<=Trow){
            dfs(row+1,column,Trow,Tcolumn,res);
        }
        if (column+1<=Tcolumn){
            dfs(row,column+1,Trow,Tcolumn,res);
        }
    }

//    public static int uniquePaths(int m, int n) {
//        if (m==1||n==1){
//            return 1;
//        }
//        return uniquePaths(m,n-1)+uniquePaths(m-1,n);
//    }
//
    public static int uniquePaths1(int row, int column) {

        int[][] dp = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i==0 || j==0){
                    dp[i][j] =1;
                }else {
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }

        return dp[row-1][column-1];

    }

//    int[][] ways = new int[m][n];
//        for (int i = 0; i < m; i++) {
//        for (int j = 0; j < n; j++) {
//            if (i == 0 || j == 0){
//                ways[i][j] = 1;
//            } else{
//                ways[i][j] = ways[i-1][j] + ways[i][j-1];
//            }
//        }
//    }
//        return ways[m-1][n-1];

}
