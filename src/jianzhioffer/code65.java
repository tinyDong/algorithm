package jianzhioffer;

public class code65 {
    public static void main(String[] args) {

        char[] matrix =new char[]{
                'a', 'b', 'c', 'e',
                's', 'f', 'c', 's',
                'a', 'd', 'e', 'e'};
        char[] str = new char[]{'b','c','e','s','c'};
        int row = 3;
        int col = 4;
        System.out.println(hasPath(matrix,row,col,str));
    }

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                boolean[] visited = new boolean[matrix.length];
                if (helper(visited,matrix,i,j,rows,cols,0,str)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean helper(boolean[] visited, char[] matrix, int i, int j, int rows, int cols, int target, char[] str) {
        int cur = i * cols + j;
        if (i<0||j<0||i>=rows || j>=cols || visited[cur] || matrix[cur] !=str[target]){
            return false;
        }

        if (str.length -1 == target ){
            return true;
        }

        visited[cur] = true;
        if (helper(visited,matrix,i+1,j,rows,cols, target+1, str)||
                helper(visited,matrix,i-1,j,rows,cols, target+1, str)||
                helper(visited,matrix,i,j+1,rows,cols, target+1, str)||
                helper(visited,matrix,i,j-1,rows,cols, target+1, str)){
            return true;
        }
        visited[cur] = false;
        return false;
    }


}
