package leetCode.code200;

public class code200 {

    public static void main(String[] args) {
        char[][] nums = new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','0','0'},
                {'1','0','1','1','0'},
                {'0','0','0','0','1'}};

        Integer result = numIslands(nums);
        System.out.println(result);
    }

    public static int numIslands(char[][] grid) {
        int res =0;

        if (grid.length==0){
            return res;
        }
        boolean[][] used = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]=='1' && !used[i][j]){
                    dfs(grid,used,i,j);
                    res++;
                }
            }
        }
        return res;
    }

    private static void dfs(char[][] grid, boolean[][] used, int i, int j) {
        if (i<0|| j<0|| i > grid[0].length-1 || j>grid[0].length-1||grid[i][j]=='0'||used[i][j]){
            return;
        }
        used[i][j]=true;
        dfs(grid,used,i+1,j);
        dfs(grid,used,i-1,j);
        dfs(grid,used,i,j+1);
        dfs(grid,used,i,j-1);
    }


}
