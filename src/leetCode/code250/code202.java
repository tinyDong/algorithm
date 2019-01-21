package leetCode.code250;
//示例:
//
//输入: 19
//输出: true
//解释:
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
public class code202 {

    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }

    public static boolean isHappy(int n) {

        while (n!=1){
            int res = 0;
            while (n!=0){
                int temp = n%10;
                res =res + temp *temp;
                n=n/10;
            }
            n =res;
            System.out.println(res);
            if (n==4){
                return false;
            }
        }
        return true;
    }
}
