package leetCode.code200;

public class code165 {


    public static void main(String[] args) {
        String version1 = "1.0", version2 = "1";

        System.out.println(compareVersion(version1,version2));
    }

    public static int compareVersion(String version1, String version2) {
        String[] strings1 = version1.split("\\.");
        String[] strings2 = version2.split("\\.");

        int minLength = Math.min(strings1.length,strings2.length);

        for (int i = 0; i <minLength; i++) {
            Integer i1 = Integer.valueOf(strings1[i]);
            Integer i2 = Integer.valueOf(strings2[i]);
            if (i1>i2){
                return 1;
            }else if (i1.equals(i2)){
                if (i ==minLength-1){
                    if (strings1.length == strings2.length){
                        return 0;
                    }else if (strings2.length > strings1.length){
                        i++;
                        while (i<strings2.length){
                            if (Integer.valueOf(strings2[i]) != 0){
                                return -1;
                            }
                            i++;
                        }
                        return 0;
                    }else {
                        i++;
                        while (i<strings1.length){
                            if (Integer.valueOf(strings1[i]) != 0){
                                return 1;
                            }
                            i++;
                        }
                        return 0;
                    }
                }
            }else {
                return -1;
            }
        }
        return 1;
    }
}
