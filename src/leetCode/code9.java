package leetCode;

public class code9 {

    public static void main(String[] args) {

        int num =101 ;
        System.out.println(repeatNum(num));
    }

    private static boolean repeatNum(int num) {
        if (num<0){
            return false;
        }

        char[] chars = String.valueOf(num).toCharArray();
        int start = 0;
        int end = chars.length-1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[start] != chars[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
