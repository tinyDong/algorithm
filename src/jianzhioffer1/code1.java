package jianzhioffer1;

public class code1 {

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}};

        System.out.println( Find(1,array));
    }
    public static boolean Find(int target, int [][] array) {
        if (array == null){
            return false;
        }
        int x = 0;
        int y = array[0].length-1;

        int cur ;
        while ( x < array[0].length &&  y >= 0){
            cur = array[x][y];
            if (target == cur){
                return true;
            }else if (target>cur){
                x++;
            }else {
                y--;
            }

        }
        return false;
    }
}
