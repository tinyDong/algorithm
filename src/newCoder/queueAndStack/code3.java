package newCoder.queueAndStack;

import java.util.Stack;

public class code3 {
// * 如何仅用递归函数和栈操作逆序一个栈
// * 题目：
//* 一个栈依次压入1，2，3，4，5，那么从栈顶到栈底分别为5，4，3，2，1。
//* 将这个栈转置后，从栈顶到栈底为1，2，3，4，5，也就是实现栈中元素的逆序，
//* 但是只能用递归函数来实现，不能用其他数据结构。
    public static void main(String[] args) {

        Stack<Integer> stack =new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        System.out.println("-------");
        reserve(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }

    private static void reserve(Stack<Integer> stack) {
        if (stack==null){
            return;
        }
        Integer value = findAndRemoveLast(stack);
        reserve(stack);
        stack.push(value);
    }

    private static Integer findAndRemoveLast(Stack<Integer> stack) {
        Integer cur = stack.pop();
        if (stack.isEmpty()){
            return cur;
        }else {
            Integer last = findAndRemoveLast(stack);
            stack.push(cur);
            return last;
        }
    }


}
