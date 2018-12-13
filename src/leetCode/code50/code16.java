package leetCode.code50;

import java.util.Arrays;

//最接近的三数之和
public class code16 {

    public static void main(String[] args) {
        int[] arr = new int[]{-4,-1,1,2,5};
        int target =-11 ;

        threeSumClosest(arr,target);
    }

    private static void threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int[] minList = new int[3];
        int minValue=arr[0]+arr[1]+arr[2];
        for (int i = 0; i < arr.length; i++) {
            int index1 = i;
            int index2 = i+1;
            int index3 = arr.length-1;
            while (index2<index3){
                int sum = arr[index1]+arr[index2]+arr[index3];
                if (target==sum){
                    minList[0]=arr[index1];
                    minList[1]=arr[index2];
                    minList[2]=arr[index3];
                    break;
                }else if (target<sum){
                    if (minValue>=sum){
                        minList[0]=arr[index1];
                        minList[1]=arr[index2];
                        minList[2]=arr[index3];
                    }
                    index3--;
                }else {
                    minList[0]=arr[index1];
                    minList[1]=arr[index2];
                    minList[2]=arr[index3];
                    index2++;
                }
            }
        }
        System.out.println(Arrays.toString(minList));
    }
}
