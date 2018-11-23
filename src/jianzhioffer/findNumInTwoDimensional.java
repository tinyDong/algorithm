package jianzhioffer;

//在一个二维数组中 ,每一行都按照从左到右递增的顺序排序，
//每一列都按照从上到下递增的顺序排序。
//请完成一个函数，输入这样的一个二维数组和一个整数，
//判断数组中是否含有该整数。
//         [1,   4,  7, 11, 15],
//         [2,   5,  8, 12, 19],
//         [3,   6,  9, 16, 22],
//         [10, 13, 14, 17, 24],
//         [18, 21, 23, 26, 30]
public class findNumInTwoDimensional {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};

        Boolean isExist = findNum(arr,5,5,18);
        System.out.println(isExist);
    }

    private static Boolean findNum(int[][] arr, int m, int n,int target) {
        int x = m-1;
        int y = 0;
        while (x>0 && y<n){
            if (arr[x][y]==target){
                return true;
            }else if (target >arr[x][y]){
                y++;
            }else {
                x--;
            }
        }

        return false;
    }
}
