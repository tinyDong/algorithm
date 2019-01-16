package leetCode.code200;

public class code171 {


    public static void main(String[] args) {
        String str = "AB";
        int result = titleToNumber(str);
        System.out.println(result);
    }

    public static int titleToNumber(String s) {
        int n = s.length();
        int res = 0;
        int tmp = 1;
        for (int i = n; i >= 1; --i) {
            res = res + (s.charAt(i - 1) - 'A' + 1) * tmp;
            tmp = tmp * 26;
        }
        return res;

    }
}
