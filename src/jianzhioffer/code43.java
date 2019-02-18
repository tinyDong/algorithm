package jianzhioffer;

import java.util.Arrays;

public class code43 {

    public static void main(String[] args) {
        System.out.println(LeftRotateString1("abcXYZdefa",3));
    }



    public static String LeftRotateString(String str,int n) {
        int move = n%str.length();
        StringBuilder sb = new StringBuilder();
        sb.append(str,move,str.length()).append(str, 0, move);
        return sb.toString();
    }

    public static String LeftRotateString1(String str,int n) {
        char[] chars = str.toCharArray();
        changeChar(chars,0,n-1);
        changeChar(chars,n,str.length()-1);
        changeChar(chars,0,str.length()-1);
        return Arrays.toString(chars);
    }

    private static void changeChar(char[] chars, int start ,int end) {
        while (start < end){
            char temp = chars[start] ;
            chars[start] = chars[end];
            chars[end ] = temp;
            start++;
            end--;
        }
    }
}
