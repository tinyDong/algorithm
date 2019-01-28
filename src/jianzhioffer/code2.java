package jianzhioffer;

public class code2 {

    public static void main(String[] args) {
        String str = "We Are Happy";

        System.out.println(replaceSpace(str));
    }

    public static String replaceSpace(String str) {
        return str.replace(" ","%20");
    }
}
