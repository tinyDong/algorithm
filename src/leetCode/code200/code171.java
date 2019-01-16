package leetCode.code200;

public class code171 {


    public static void main(String[] args) {
        String str = "AB";
        int result = titleToNumber(str);
        System.out.println(result);

        System.out.println(('B'+1-'A'));
    }

    public static int titleToNumber(String s) {
        int n = s.length();
        int res = 0;
        int temp = 1;
        for (int i = s.length()-1; i >=0 ; i--) {
            res =res + (s.charAt(i) +1 -'A')*temp;
            temp = temp *26;
        }
        return res;

    }
}
