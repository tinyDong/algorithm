package leetCode.code200;

import java.util.Stack;

public class code155 {

    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        code155 minStack = new code155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
//        --> 返回 -3.
        System.out.println(minStack.getMin());
        minStack.pop();
//        ;      --> 返回 0.
        System.out.println(minStack.top());
        minStack.getMin();
    }

    public void push(int x) {

        if (minStack.isEmpty()){
            minStack.push(x);
        }else{
            if (minStack.peek()>x){
                minStack.pop();
                minStack.push(x);
            }
        }
        stack.push(x);
    }

    public void pop() {
        Integer temp =stack.pop();
        if (temp.equals(minStack.peek())){
            minStack.pop();
        }
    }

    public int top() {
        return stack.pop();
    }

    public int getMin() {
        if (minStack.isEmpty()){
            return -1;
        }
        return minStack.peek();
    }
}
