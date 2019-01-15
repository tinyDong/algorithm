package leetCode.code150;


//示例 1：
//
//输入: ["2", "1", "+", "3", "*"]
//输出: 9
//解释: ((2 + 1) * 3) = 9
//示例 2：
//
//输入: ["4", "13", "5", "/", "+"]
//输出: 6
//解释: (4 + (13 / 5)) = 6

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class code150 {
    public static void main(String[] args) {
        String[] strings = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Integer result = evalRPN(strings);
        System.out.println(result);
    }

    public static int evalRPN(String[] tokens) {
        List<String> characters =getChars();

        Stack<String> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (!characters.contains(tokens[i])){
                stack.push(tokens[i]);
            }else {
                String temp = tokens[i];
                String string1=stack.pop();
                String string2=stack.pop();
                if (temp.equals("+")){
                    res = Integer.valueOf(string1) + Integer.valueOf(string2);
                    stack.push(String.valueOf(res));
                }
                if (temp.equals("-")){
                    res = Integer.valueOf(string2) - Integer.valueOf(string1);
                    stack.push(String.valueOf(res));
                }
                if (temp.equals("*")){
                    res = Integer.valueOf(string1) * Integer.valueOf(string2);
                    stack.push(String.valueOf(res));
                }
                if (temp.equals("/")){
                    res = Integer.valueOf(string2) / Integer.valueOf(string1);
                    stack.push(String.valueOf(res));
                }
                System.out.println("res = " + res);
            }
        }
        return res;
    }

    private static List<String> getChars() {
        List<String> characters = new ArrayList<>();
        characters.add("+");
        characters.add("-");
        characters.add("*");
        characters.add("/");
        return characters;
    }
}
