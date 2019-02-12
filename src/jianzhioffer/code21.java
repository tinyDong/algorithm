package jianzhioffer;

import java.util.Stack;

public class code21 {

    public static void main(String[] args) {
        int[] pushA = new int[]{1,2,3,4,5};
        int[] popA = new int[]{4,5,3,2,1};

        System.out.println(IsPopOrder(pushA,popA));
    }

    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int postIndex = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[postIndex]){
                stack.pop();
                postIndex ++;
            }
        }
        return stack.isEmpty();
    }

}
