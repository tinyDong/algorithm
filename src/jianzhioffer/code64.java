package jianzhioffer;

import java.util.Arrays;
import java.util.LinkedList;

public class code64 {
//    2,3,4,2,6,2,5,1
//    4,4,6,6,6,5}
    public static void main(String[] args) {

        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums,3)));
    }

    public static int[] maxSlidingWindow(int[] num, int k) {
        if (num.length==0){
            return new int[]{};
        }
        int[] res = new int[num.length-k+1];
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < num.length; i++) {
            Integer cur = num[i];
            while (!queue.isEmpty() && cur > num[queue.peekLast()]){
                queue.pollLast();
            }
            queue.add(i);
            if (queue.peekLast()>k-2){
                res[i -k +1] =num[queue.peekFirst()];
            }
            if (i - k == queue.peekFirst()-1){
                queue.pollFirst();
            }
        }
        return res;
    }
}
