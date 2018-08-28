package String;


public class ReserveString {

    public static void test(String str){
        char[] chars = str.toCharArray();
        reserveStr(chars,0,chars.length-1);
        int start = 0 , end = 0 ;
        while (start <chars.length){
            if (chars[start] ==  ' '){
                start++;
                end++;
            }else if (end==chars.length ||chars[end] == ' '){
                reserveStr(chars,start,end-1);
                end++;
                start=end;
            }else {
                end++;
            }
        }
        System.out.println(chars);
    }

    private static void reserveStr(char[] chars,int start,int end){
        while (start<end){
            char temp = chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        test("like am lxd");
    }
}
