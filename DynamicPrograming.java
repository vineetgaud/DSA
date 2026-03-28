//import java.util.Arrays;

//public class DynamicPrograming {

    // Climbing Stairs recursive
   /* public static int CountWays(int n){
        if (n==0) {
            return 1;
        }
        if (n<0) {
            return 0;
        }
        return CountWays(n-1) + CountWays(n-2);
    }*/



    //  Climbing Stairs Memoization

   /* public static int CountWays(int n, int ways[]){
        if (n==0) {
            return 1;
        }
        if (n<0) {
            return 0;
        }
        if (ways[n]!=-1) { // already calculated
            return ways[n];
        }
        ways[n]= CountWays(n-1, ways) + CountWays(n-2, ways);
        return ways[n];
    }*/


    // Climbing Stairs (Tabulation)

   /* public static int CountWaysTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i=1; i<=n; i++){
            if (i==1) {
                dp[i] = dp[i-1]+0;
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }*/


    // 0 -1 Knapsack

   /* public static int Knapsack(int val[], int wt[], int W, int n){
        if (W == 0 || n == 0) {
            return 0;
        }

        if (wt[n-1] <= W) { // valid
            // include
            int ans1 = val[n-1]+Knapsack(val, wt, W-wt[n-1], n-1) ;
            // exclude
            int ans2 = Knapsack(val, wt, W, n-1);
            return Math.max(ans1, ans2);
        }else{// not valid
              return Knapsack(val, wt, W, n-1);
        }
    }*/
    // 0-1 knapsack memoization
   /* public static int KnapsackMemo(int val[], int wt[], int W, int n, int dp[][]){
        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n-1] <= W) { // valid
            // include
            int ans1 = val[n-1]+KnapsackMemo(val, wt, W-wt[n-1], n-1, dp) ;
            // exclude
            int ans2 = KnapsackMemo(val, wt, W, n-1, dp);
            dp[n][W]  = Math.max(ans1, ans2);
            return dp[n][W];
        }else{// not valid
              dp[n][W] = KnapsackMemo(val, wt, W, n-1, dp);
              return dp[n][W];
        }
    }*/



    /*public static int KnapsackTab(int val[], int wt[], int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j=0; j<dp[0].length; j++){
            dp[0][j] = 0;
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<W+1; j++){
                int V = val[i-1];
                int w = wt[i-1];
                if (w<=j) {
                    int incprofit = V+ dp[i-1][j-w];
                    int excprofit = dp[i-1][j];
                    dp[i][j] = Math.max(incprofit, excprofit);
                }else{
                    int excprofit = dp[i-1][j];
                    dp[i][j] = excprofit;
                }
            }
        }

        return dp[n][W];
    }*/
    //public static void main(String[] args) {
       /* int n =5; 
       // System.out.println(CountWays(n));
       int ways[] = new int[n+1];
       Arrays.fill(ways, -1);
      // System.out.println(CountWays(n, ways));

      System.out.println(CountWaysTab(n));*/

      
      // 0 -1 Knapsack
      /*int val[] = {15, 14, 10, 45, 30};
      int wt[] = {2, 5, 1, 3, 4};
      int W = 7;
      int dp [][] = new int[val.length+1][W+1];
      for(int i=0; i<dp.length; i++){
        for(int j=0; j<dp[0].length; j++){
            dp[i][j] = -1;
        }
      }
      //System.out.println(KnapsackMemo(val, wt, W, val.length, dp));
      System.out.println(KnapsackTab(val, wt, W));
    }
}
*/