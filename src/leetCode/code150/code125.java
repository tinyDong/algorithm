package leetCode.code150;

public class code125 {

    public static void main(String[] args) {

        String string  = "raceaecar";
        System.out.println(isPalindrome(string));
    }

    public static boolean isPalindrome(String s) {
        s =s.toUpperCase();
        int start = 0,end = s.length()-1;
        while (start<end){
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
