package leetCode;

//1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221

public class code38 {

    public static void main(String[] args) {
         int n = 4;
         System.out.println(countAndSay(n));

    }

    private static String countAndSay(int n) {
       return "";
    }




    //        if (n <= 0) return "";
//        string res = "1";
//        while (--n) {
//            string cur = "";
//            for (int i = 0; i < res.size(); ++i) {
//                int cnt = 1;
//                while (i + 1 < res.size() && res[i] == res[i + 1]) {
//                    ++cnt;
//                    ++i;
//                }
//                cur += to_string(cnt) + res[i];
//            }
//            res = cur;
//        }
//        return res;


}
