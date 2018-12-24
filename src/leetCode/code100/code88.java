package leetCode.code100;

import java.util.Arrays;

public class code88 {

    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{2,5,6};
        int m =3 ,n =3 ;
        merge(num1,m,num2,n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int a = 0,b = 0;
        int[] res = new int[m+n];
        for (int i = 0; i < m + n; i++) {
            if (a<m && nums1[a]<=nums2[b]){
                res[i] = nums1[a];
                a++;
            }else {
                res[i] = nums2[b];
                b++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
