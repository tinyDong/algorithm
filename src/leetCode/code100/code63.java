package leetCode.code100;

public class code63 {
    public static void main(String[] args) {

        int[][] nums = new int[][]{{0,0,0,0},{0,1,0,0},{0,0,0,0}};
        System.out.println(uniquePathsWithObstacles1(nums));
        System.out.println(uniquePathsWithObstacles(nums));
    }

    public static int uniquePathsWithObstacles1(int[][] nums) {
        int[][] dp = new int[nums.length][nums[0].length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (i==0|j==0){
                    dp[i][j] = 1;
                }else {
                    if (nums[i][j]==1){
                        dp[i][j] = 0;
                    }else {
                        dp[i][j] = dp[i-1][j] + dp[i][j-1];
                    }
                }
            }
        }

        return dp[nums.length-1][nums[0].length-1];
    }













    public static int uniquePathsWithObstacles(int[][] nums) {
        int[] res = new int[]{0};
        dfs(0,0,nums.length-1,nums[0].length-1,nums,res);
        return res[0];
    }

    private static void dfs(int curR, int curC, int row, int column, int[][] nums, int[] res) {

        if (nums[curR][curC]==1){
            return;
        }

        if (curR==row && column==curC){
            res[0] = res[0]+1;
            return;
        }

        if (curR+1<=row){
            dfs(curR+1,curC,row,column,nums,res);
        }

        if (curC+1<=column ){
            dfs(curR,curC+1,row,column,nums,res);
        }
    }
}

