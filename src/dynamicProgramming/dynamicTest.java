package dynamicProgramming;

public class dynamicTest {


//    https://www.sohu.com/a/153858619_466939
    public static void main(String[] args) {

        int result= getMostGold(5,10,new int[]{400,300,550,300,200},new int[]{5,5,2,4,3});
        System.out.println(result);

        int result2 = maxGoldRecursion(5,10,new int[]{400,300,550,300,200},new int[]{5,5,2,4,3});
        System.out.println("2======="+result2);

    }

    static int maxGoldRecursion(int n , int w , int[] g, int[] p){
        if (n==1){
            return w<p[n-1]?0:g[n-1];
        }

        if (w<p[n-1]){
            return maxGoldRecursion(n-1,w,p,g);
        }

        return Math.max(maxGoldRecursion(n-1,w,g,p),g[n-1]+ maxGoldRecursion(n-1,w-p[n-1],g,p));
    }


    public static int getMostGold(int n , int w ,int[] g,int[] p){

        int[] preResults = new int[w];
        int[] results = new int[w];

        for (int i = 0; i < w; i++) {
            if (i+1 <p[0]){
                preResults[i] = 0;
            }else {
                preResults[i] = g[0];
            }
        }

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < w; j++) {
                if (j +1< p[i]){
                    results[j] = preResults[j];
                }else if (j+1 == p[i]){
                    results[j] = Math.max(preResults[j],preResults[j-p[i]+1]+g[i]);
                }
                else{
                    results[j] = Math.max(preResults[j],preResults[j-p[i]]+g[i]);
                }
            }
            System.arraycopy(results, 0, preResults, 0, preResults.length);
        }

        return results[w-1];
    }


    static int Method_1(int n,int w,int [] m,int [] p)
    {
        int[] preResult = new int[w];
        int[] result = new int[w];
        for(int i = 0; i <p.length; i++)
        {
            if (w < p[i])
            {
                preResult[i] = 0;
            }
            else
            {
                preResult[i] = m[i];
            }
        }



        for(int i = 0; i < n; i++)//金矿
        {
            for(int j = 0; j < w; j++)//挖矿工数
            {
                if (j < p[i])
                {
                    result[j] = preResult[j];
                }
                else
                {
                    result[j] = (preResult[j - p[i]] + m[i]) > preResult[j] ? (preResult[j - p[i]] + m[i]) : preResult[j];
                }
            }
            preResult = result;
        }
        return result[n-1];


    }

}
