package leetCode.code250;

public class code223 {

    public static void main(String[] args) {

        System.out.println(computeArea( -3, 0, 3, 4, 0, -1, 9, 2));
    }

    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int sum = (C-A)*(D-B) + (G-E)*(H-F);
        int lx,dy,rx,ty;
        lx = Math.max(A,E);

        dy = Math.max(B,F);

        rx = Math.min(C,G);

        ty = Math.min(D,H);

        int meetArea = (ty-dy)*(rx -lx);
        if (E >= C || F >= D || B >= H || A >= G) return sum;
        return  sum-meetArea;
    }

}
