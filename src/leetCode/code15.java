package leetCode;

//15 三数之和
//例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//满足要求的三元组集合为：
//[
//[-1, 0, 1],
//[-1, -1, 2]
//]
public class code15 {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        int result = sumThreeNumber(nums);
    }

    private static int sumThreeNumber(int[] arrs) {

        List<List<Integer>> resultLust = new ArrayList();

        Arrays.sort(arrs);
        for (int i = 0; i < arrs.length; i++) {
            int index1 = i;

            int index2 = i+1;
            int index3 = arrs.length-1;
            int temp = 0 - arrs[index1];
            while (index2<index3){
                if (arrs[index2]+arrs[index3]==temp){
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(arrs[index1]);
                    tempList.add(arrs[index2]);
                    tempList.add(arrs[index3]);
                    resultLust.add(tempList);
                    break;
                }else if (arrs[index2]+arrs[index3]>temp){
                    index3--;
                }else {
                    index2++;
                }

            }
        }
        for (List<Integer> list:resultLust){
            for(Integer i : list){
                System.out.println(i);
            }

            System.out.println("===========");
        }
        return 0;
    }

}
