package leetCode;

import java.util.Arrays;

//最接近的三数之和
public class code16 {

    public static void main(String[] args) {
        int[] arr = new int[]{-4,-1,1,2,5};
        int target =2 ;

        threeSumClosest(arr,target);
    }

    private static void threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int[] minList = new int[3];
        int minValue = arr[0]+arr[1]+arr[2];

        for (int i = 0; i < arr.length; i++) {

            int index1 = i;
            int index2 = i+1;
            int index3 = arr.length-1;
            while (index2<index3){
                int temp =target - arr[index1]-arr[index2]-arr[index3];
                if (temp==0){
                    minList[0]=arr[index1];
                    minList[1]=arr[index2];
                    minList[2]=arr[index3];
                    break;
                }else if (temp<0){
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
