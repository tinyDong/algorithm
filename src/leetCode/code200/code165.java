package leetCode.code200;

public class code165 {


    public static void main(String[] args) {
        String version1 = "1.0.1", version2 = "1";

        System.out.println(compareVersion(version1,version2));
    }

    public static int compareVersion(String version1, String version2) {
        String[] strings1 = version1.split("\\.");
        String[] strings2 = version2.split("\\.");

        int maxLength = Math.max(strings1.length,strings2.length);

        String[] strings3 = new String[maxLength];

        if (strings1.length == strings2.length){
            return compareStr(strings1,strings2);
        }else if (strings1.length>strings2.length){
            for (int i = 0; i < strings3.length; i++) {
                if (i<strings2.length){
                    strings3[i] = strings2[i];
                }else {
                    strings3[i] ="0";
                }
            }
            return compareStr(strings1,strings3);
        }else {
            for (int i = 0; i < strings3.length; i++) {
                if (i<strings1.length){
                    strings3[i] = strings1[i];
                }else {
                    strings3[i] ="0";
                }
            }
            return compareStr(strings3,strings2);
        }
    }

    private static int compareStr(String[] strings1, String[] strings2) {

        for (int i = 0; i < strings1.length; i++) {
            Integer num1 = Integer.valueOf(strings1[i]);
            Integer num2 = Integer.valueOf(strings2[i]);
            if (num1.equals(num2)){
                continue;
            }else if (num1>num2){
                return 1;
            }else {
                return -1;
            }
        }
        return 0;
    }
}
