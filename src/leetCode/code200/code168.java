package leetCode.code200;

public class code168 {
    public static void main(String[] args) {

        System.out.println(convertToTitle(28));
    }

    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();

        while (n!=0){
            char ch = (char)(n%26 + 'A' - 1);
            sb.append(ch);
            n = n/26;
        }
        sb.reverse();

        return sb.toString();
    }
}
