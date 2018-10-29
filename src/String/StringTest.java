package String;

import java.util.Arrays;

public class StringTest {


    public static void main(String[] args) {
        String str ="the sky is blue";
        //eulb si yks eht
        //blue is sky the

        System.out.println(reserveString(str));
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
