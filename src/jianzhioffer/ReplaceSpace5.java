package jianzhioffer;

import java.util.Arrays;

public class ReplaceSpace5 {

    public static void main(String[] args) {
        char[] chars ="We Are Happy".toCharArray();
        
        String result = replaceSpace(chars);
        System.out.println(result);
    }

    private static String replaceSpace(char[] chars) {
        
        int appendLength =0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==' '){
                appendLength=appendLength+2;
            }
        }
        
        char[] newArr = new char[appendLength+chars.length];
        int j =0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==' '){
                newArr[j++] = '%';
                newArr[j++] = '2';
                newArr[j++] = '0';
            }else {
                newArr[j]=chars[i];
                j++;
            }
        }
        return Arrays.toString(newArr);
    }
}
