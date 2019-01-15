package leetCode.code200;

public class code151 {

//    输入: "the sky is blue",
//    输出: "blue is sky the".
    public static void main(String[] args) {
        String str = "the sky is blue";

        String result = reverseWords(str);
        System.out.println(result);
    }


    public static String reverseWords(String str) {
        char[] chars = str.toCharArray();
        int start =0;
        for (int i = 0; i < chars.length; i++) {
            if (str.charAt(i)==' '){
                reserveStr(start,i-1,chars);
                start =i+1;
            }else if(i == chars.length-1){
                reserveStr(start,i,chars);
            }
        }
        reserveStr(0,chars.length-1,chars);
        return String.valueOf(chars);
    }

    private static void reserveStr(int start, int i, char[] chars) {
        while (start<i){
            char temp = chars[start];
            chars[start] = chars[i];
            chars[i] = temp;
            start++;
            i--;
        }
    }


}
