package jianzhioffer;

public class code43 {

    public static void main(String[] args) {
        System.out.println(LeftRotateString("abcXYZdef",3));
    }
    public static String LeftRotateString(String str,int n) {
        int move = n%str.length();
        StringBuilder sb = new StringBuilder();
        sb.append(str,move,str.length()).append(str, 0, move);

        return sb.toString();
    }
}
