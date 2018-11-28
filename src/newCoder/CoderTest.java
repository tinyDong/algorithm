package newCoder;

public class CoderTest {
//    有一排正数，玩家A和玩家B都可以看到。
//    每位玩家在拿走数字的时候，都只能从最左和最右的数中选择一个。
//    玩家A先拿，玩家B再拿，两人交替拿走所有的数字，
//    两人都力争自己拿到的数的总和比对方多。请返回最后获胜者的分数

    public static final int[] nums = new int[]{5,2,3,4,1};


    public static void main(String[] args) {

//        int result = win1(nums);
        int result = win2(nums);

        System.out.println(result);
    }

    private static int win2(int[] nums) {
        int[][] f = new int[nums.length][nums.length];
        int[][] s = new int[nums.length][nums.length];
        for (int j = 0; j <nums.length; j++) {
            f[j][j] = nums[j];
            for (int i = j-1; i >=0 ; i--) {
                f[i][j] = Math.max(nums[i] + s[i+1][j],nums[j]+s[i][j-1]);
                s[i][j] = Math.min(f[i+1][j],f[i][j-1]);
            }
        }

        return Math.max(f[0][nums.length-1],s[0][nums.length-1]);
    }

    private static int win1(int[] nums) {
        return Math.max(before(nums,0,nums.length-1),after(nums,0,nums.length-1));
    }

    private static int before(int[] arr ,int i,int j){
        if (i==j){
            return arr[i];
        }

        return Math.max(arr[i] + after(arr,i+1,j),arr[j] + after(arr,i,j-1));
    }

    private static int after(int[] arr ,int i,int j){
        if (i==j){
            return 0;
        }
        return Math.min(before(arr,i+1,j),before(arr,i,j-1));
    }




}
