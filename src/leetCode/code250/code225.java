package leetCode.code250;

//使用队列实现栈的下列操作：
//
//push(x) -- 元素 x 入栈
//pop() -- 移除栈顶元素
//top() -- 获取栈顶元素
//empty() -- 返回栈是否为空

import java.util.ArrayDeque;
import java.util.Queue;

public class code225 {

    Queue<Integer> inQueue;
    Queue<Integer> outQueue;

    public static void main(String[] args) {
        code225 test = new code225();
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);

        while (!test.empty()){
            System.out.println(test.pop());
        }

    }
    public code225() {
        inQueue  = new ArrayDeque<>();
        outQueue  = new ArrayDeque<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        while (!inQueue.isEmpty()){
            outQueue.add(inQueue.poll());
        }
        inQueue.add(x);
        while (!outQueue.isEmpty()){
            inQueue.add(outQueue.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return inQueue.isEmpty()?-1:inQueue.poll();
    }

    /** Get the top element. */
    public int top() {
        return inQueue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return inQueue.isEmpty() && outQueue.isEmpty();
    }
}
