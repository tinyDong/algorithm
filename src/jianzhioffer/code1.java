package jianzhioffer;

public class code1 {
    public static void main(String[] args) {

    }

    public static boolean Find1(int target, int [][] array) {
        if (array.length==0){
            return false;
        }
        int row = 0;
        int column = array[0].length-1;

        while (row < array.length && column >= 0){
            if (array[row][column] == target){
                return true;
            }else if (array[row][column] > target){
                column--;
            }else {
                row++;
            }
        }
        return false;
    }

    public static boolean Find2(int target, int[][] array) {
       if (array.length == 0) return false;
       int m = array.length,n = array[0].length;
       int left = 0, right = m * n;
       while (left<right){
           int mid = (left +right)/2;
           if (array[mid /n][mid %n] == target){
               return true;
           }else if (array[mid /n][mid %n]<target){
               left =mid +1;
           }else {
               right = mid ;
           }
       }
       return false;
    }
//    if(matrix.length == 0) return false;
//    int m = matrix.length;
//    int n = matrix[0].length;
//    int low = 0, high = m * n;
//        while(low < high){
//        int mid = (low + high) / 2;
//        if(matrix[mid / n][mid % n] == target){
//            return true;
//        }else if(matrix[mid / n][mid % n] < target){
//            low = mid + 1;
//        }else{
//            high = mid;
//        }
//    }
//    return false;



}
