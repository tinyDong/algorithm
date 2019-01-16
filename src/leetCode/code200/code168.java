package leetCode.code200;

public class code168 {
    public static void main(String[] args) {

        System.out.println(convertToTitle(100));
    }

    public static String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        while (n!=0){
            n--;
            char ch = (char)(n % 26 +'A');
            n = n/26;
            res.append(ch);
        }
        res.reverse();
        return res.toString();
    }
}
