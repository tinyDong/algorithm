package String;

//String str = "abaddcc";
// aabbaa
//最长回文字符串
public class RepeatStr {
    public void test(String str){
        if (str==null){
            return;
        }
        String maxStr="";

        char[] chars=str.toCharArray();
        int length = str.length();
        int start = 0 , end = start;

        while (start<length-1){
            String subStr=this.findMax(str,start,start+1);
            maxStr=maxStr.length()>subStr.length()?maxStr:subStr;

            String subStr1=this.findMax(str,start,start);
            maxStr=maxStr.length()>subStr.length()?maxStr:subStr1;

            start++;
        }

        System.out.println(maxStr);
    }

    private String findMax(String str,int start,int end){
        String subStr = "";
        char[] chars = str.toCharArray();
        while (start>=0&&end<chars.length&&chars[start] == chars[end]){
            subStr=subStr.length()>str.substring(start,end+1).length()?subStr:str.substring(start,end+1);
            end++;
            start--;
        }

        return subStr;
    }

    public static void main(String[] args) {
        new RepeatStr().test("abbadddddc");
    }
}
