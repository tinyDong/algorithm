package jianzhioffer;

public class code9 {
    public static void main(String[] args) {

        System.out.println(JumpFloorII(4));
    }

    public static int JumpFloorII(int target) {
        int res =0;

        int b = 2;
        for (int i = 3; i <= target; i++) {
            res = b*2;
            b = res;
        }
        return res;
    }

}
