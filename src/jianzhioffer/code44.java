package jianzhioffer;

public class code44 {
    //student. a am I
    public static void main(String[] args) {
        String str = "the sky is blue";
        // .tneduts a ma I
        //I am a student.
        System.out.println(ReverseSentence(str));
    }

    public static String ReverseSentence(String str) {

        char[] chars = str.toCharArray();
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == ' ' ){
                reservesWord(chars,start,i-1);
                start = ++i;
            }else if (i==chars.length-1){
                reservesWord(chars,start,i);
                start = ++i;
            }
        }
        reservesWord(chars,0,chars.length-1);
        return String.valueOf(chars);
    }


    private static void reservesWord(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
