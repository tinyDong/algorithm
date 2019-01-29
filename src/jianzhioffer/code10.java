package jianzhioffer;

public class code10 {
    public static void main(String[] args) {
        System.out.println(RectCover(4));
    }

    public static int RectCover(int target) {
        int a = 1;
        int b = 2;
        int res = 0;
        for (int i = 3; i <=target; i++) {
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }
}
