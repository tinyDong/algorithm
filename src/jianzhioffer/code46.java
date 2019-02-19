package jianzhioffer;

import java.util.LinkedList;
import java.util.List;

public class code46 {
    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(6,3));
    }

    public static int LastRemaining_Solution(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int idx = 0;
        while (list.size() > 1) {
             idx = (idx + m-1) % list.size();
            list.remove(idx);
        }
        return list.get(0);
    }

}
