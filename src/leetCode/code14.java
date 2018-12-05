package leetCode;

//最长公共前缀
public class code14 {
    public static void main(String[] args) {
        String[] strings = new String[]{"flower","flow","flight"};
        String res = getCommonPrefix(strings);
        System.out.println(res);
    }

    private static String getCommonPrefix(String[] strList) {
        int index = 0;

        for (int i = 0; i < strList[0].length(); i++) {
            char current = strList[0].charAt(index);
            for (String s:strList){
                if (s.charAt(index) != current || s.length()==i){
                    return s.substring(0,index);
                }
            }
            index++;
        }
        return strList[0].substring(0,index);
    }
}
