package leetCode;
//给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
//
//示例 1:
//
//输入: num1 = "2", num2 = "3"
//输出: "6"
//示例 2:
//
//输入: num1 = "123", num2 = "456"
//输出: "56088"
public class code43 {

    public static void main(String[] args) {


    }

//    public String multiply(String num1, String num2) {
//        //字符串反转
//        num1 = new StringBuilder(num1).reverse().toString();
//        num2 = new StringBuilder(num2).reverse().toString();
//        //两数相乘  最大位数为两者位数之和
//        int[] b = new int[num1.length()+num2.length()];
//
//        for (int i = 0;i < num1.length();i++){
//            for (int j = 0;j < num2.length();j++){
//                //先获取对应位相乘  不考虑进位
//                b[i+j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
//
//            }
//        }
//
//        for (int i = 0;i<num1.length() + num2.length();i++){
//            //对进位进行处理
//            if (b[i]>9){
//                b[i+1] += b[i]/10;
//                b[i] %= 10;
//            }
//        }
//
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = num1.length()+num2.length()-1;i>=0;i--){
//            stringBuilder.append(b[i]);
//        }
//
//        //去除首部的0
//        while (stringBuilder.charAt(0) == '0' && stringBuilder.length()>1)  stringBuilder.deleteCharAt(0);
//
//        return stringBuilder.toString();
//    }

}
