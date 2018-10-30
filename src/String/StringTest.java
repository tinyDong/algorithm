package String;

import java.util.Arrays;

public class StringTest {

    //
//        给定 "abcabcbcabx" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
//
//        给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
//
//        给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
    public static void main(String[] args) {
//        String str ="the sky is blue";
        //eulb si yks eht
        //blue is sky the

//        System.out.println(reserveString(str));

//        示例 1：
//
//        输入: "babad"
//        输出: "bab"
//        注意: "aba"也是一个有效答案。
//        示例 2：
//
//        输入: "cbbd"
//        输出: "bb"

        String input = "abcabcbcabx";

        input="abcabcbacabx";

        String result = findLongestStr(input);
        System.out.println(result);
    }

    private static String findLongestStr(String input) {
        String result ="";
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            String temp1 = findRepeatStr(i,i,chars);

            String temp2 = findRepeatStr(i,i+1,chars);
            if (temp2.length()>result.length()){
                result=temp2;
            }

            if (temp1.length()>result.length()){
                result = temp1;
            }

        }
        return result;
    }

    private static String findRepeatStr(int low,int high ,char[] chars) {
        String result ="";
        while (low>=0&&high<chars.length&&chars[low]==chars[high]){
            result = String.copyValueOf(chars,low,high-low+1);
            low--;
            high++;
        }
        return result;
    }


    //字符串翻转
    public static String reserveString(String str){

        char[] chars = str.toCharArray();

        reserveWord(chars,0,chars.length-1);

        int low =0 ,high = 0;
        for (char c:chars){
            System.out.println(high);
            if (c ==' '){
                reserveWord(chars,low,high-1);
                high++;
                low=high;
            }else if (high==chars.length-1){
                reserveWord(chars,low,high);
            }else {
                high++;
            }
        }

        return Arrays.toString(chars);
    }



    private static void reserveWord(char[] chars,int start,int end) {
        while (start<end){
            char temp = chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
    }
}
