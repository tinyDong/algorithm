package leetCode;

import java.util.ArrayList;
import java.util.List;

public class code22 {
// 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
//
//例如，给出 n = 3，生成结果为：
//
//[
//"((()))",
//"(()())",
//"(())()",
//"()(())",
//"()()()"
// ]
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(3));
    }


    public static List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList();
        String str=new String();
        generate(list,str,n,n);
        return list;
    }
    //list的改动是全局性的，但是str每次传递时并不是将本身传给下面，而是str+‘（’或者str+')'传递，所以下一层的改动并不会影响上一层。
    public static void generate(List<String> list,String str,int left,int right) {
        System.out.println(str);
        if (left == 0 && right == 0) {
            list.add(str);
            return;
        }
        if (left > 0) {
            generate(list, str + '(', left - 1, right);
        }
        if (right > left) {
            generate(list, str + ')', left, right - 1);
        }
    }

}
