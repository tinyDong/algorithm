package jianzhioffer;

public class code66 {
    public static void main(String[] args) {

        System.out.println(movingCount(0,3,3));
    }

    public static int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] visited = new boolean[rows][cols];
        return helper(0,0,rows,cols,threshold,visited);

    }

    private static int helper(int i, int j, int rows, int cols, int threshold, boolean[][] visited) {

        int sum  = getSum(i) + getSum(j);
        if (i<0 || i>=rows || j<0 || j>=cols ||visited[i][j] || sum>threshold ){
            return 0;
        }
        visited[i][j] = true;
        return helper(i+1,j,rows,cols,threshold,visited) +
                helper(i-1,j,rows,cols,threshold,visited)+
                helper(i,j+1,rows,cols,threshold,visited)+
                helper(i,j-1,rows,cols,threshold,visited)+1;

    }

    private static int getSum(int i) {
        int sum = 0;
        while (i!=0){
            sum += i%10;
            i = i/10;
        }
        return sum;
    }
}
