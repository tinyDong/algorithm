package leetCode.code250;

public class code240 {

    public boolean searchMatrix(int[][] array, int target) {
        if (array.length ==0)return false;

        int x =0,y = array[0].length-1;

        while (x<array.length && y >=0){
            if (array[x][y] == target){
                return true;
            }else if (array[x][y] < target){
                x++;
            }else {
                y--;
            }
        }
        return false;
    }


}
