package jianzhioffer;

import java.util.Stack;

public class code20 {


    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public static void main(String[] args) {
        code20 test = new code20();
        test.push(3);
        test.push(2);
        System.out.println(test.min());
        System.out.println(test.top());

        test.push(4);
        test.push(1);
        System.out.println(test.min());
        System.out.println(test.top());
        test.pop();
        System.out.println(test.min());
        System.out.println(test.top());

    }

    public void push(int node) {
        stack.push(node);
        if (!minStack.isEmpty()){
            if (minStack.peek()>node){
                minStack.push(node);
            }
        }else {
            minStack.push(node);
        }
    }

    public void pop() {
        Integer value =stack.pop();
        if (minStack.peek().equals(value)){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
