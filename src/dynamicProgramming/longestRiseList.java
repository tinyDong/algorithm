package dynamicProgramming;

//最长递增子序列 2, 11, 4, 12, 6, 1
public class longestRiseList {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 11, 4, 12, 6, 1};

        getLongestList1(arr);
    }

    private static void getLongestList1(int[] arr) {
        int maxLength=1;
        int[] f = new int[arr.length];//用于存放f(i)值；
        for (int i = 0; i < arr.length; i++) {
            f[i]=1;//以第a1为末元素的最长递增子序列长度为1；
            for (int j = 0; j <i; j++) {
                if (arr[j]<arr[i]&&f[j]>f[i]-1){
                    f[i]=f[j]+1;
                    maxLength = Math.max(maxLength,f[i]);
                }
            }
        }
        System.out.println(maxLength);
    }
}
