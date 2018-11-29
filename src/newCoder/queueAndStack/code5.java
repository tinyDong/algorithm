package newCoder.queueAndStack;

import java.util.Stack;

//一个栈中元素的类型为整形，现在想将该栈从顶到底按从大到小的顺序排序，只许申请一个栈。
// 除此之外，可以申请新的变量，但不能申请额外的数据结构。如何完成排序
public class code5 {

    public static void main(String[] args) {

        Stack<Integer> stack =new Stack<>();
        stack.push(7);
        stack.push(9);
        stack.push(8);
        stack.push(10);
        stack.push(12);
        stack.push(11);

        orderStack(stack);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    private static void orderStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()){
            Integer cur = stack.pop();
            while (!help.isEmpty()&&cur>help.peek()){
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()){
            stack.push(help.pop());
        }
    }
}
