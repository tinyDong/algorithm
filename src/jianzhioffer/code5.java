package jianzhioffer;

import java.util.Stack;

public class code5 {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public static void main(String[] args) {

        code5 test = new code5();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);

        while (!test.empty()){
            System.out.println(test.poll());
        }
    }

    public code5(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void add(Integer val){
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        stack1.push(val);
    }

    public Integer poll(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public boolean empty(){
        return stack1.isEmpty()&&stack2.isEmpty();
    }
}
