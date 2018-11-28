package newCoder.queueAndStack;

import java.util.Stack;

public class code1 {

    private  static Stack<Integer> stackData = new Stack<>();

    private  static Stack<Integer> stackMin = new Stack<>();


    private static Integer pop(){
        Integer result = stackMin.pop();
        if (getMin().equals(result)){
            stackMin.pop();
        }
        return result;
    }

    private static void push(Integer value){

        if (stackMin.isEmpty()||value<=getMin()){
            stackMin.push(value);
        }
        stackData.push(value);
    }

    private static Integer getMin(){
        return stackMin.peek();
    }


    public static void main(String[] args) {


    }
}
