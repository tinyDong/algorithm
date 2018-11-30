package newCoder.queueAndStack;

import java.util.Arrays;
import java.util.LinkedList;

//生成窗口最大值数组
//[4,3,5,5,4,3,3,6,7]
public class code7 {

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,5,5,4,3,3,6,7};
        int w = 3;
//        int[] result =  getMax1( arr, w);
        int[] result =  getMax2( arr, w);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getMax2(int[] arr, int w) {
        if(arr==null||arr.length<1&&w<1){
            return null;
        }

        LinkedList<Integer> queue = new LinkedList<>();
        int[] res = new int[arr.length-w+1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!queue.isEmpty()&&arr[i]>= arr[queue.peekLast()]){
                queue.pollLast();
            }
            queue.add(i);
            if (queue.peekFirst() == i-w){
                queue.pollFirst();
            }
            if (i>= w-1){
                res[index++] = arr[queue.peekFirst()];
            }
        }
        return res;
    }

    private static int[] getMax1(int[] arr, int w) {
        int[] resultArr = new int[arr.length-w+1];
        int index =0;
        for (int i = 0; i <= arr.length-w; i++) {
            int max = arr[i];
            for (int j = i; j <i+w ; j++) {
                max = Math.max(max,arr[j]);
            }
            resultArr[index++] = max;
        }
        return resultArr;
    }



}
