public class UberSDE {
    public static void main(String[] args) {
        int n = 5;
        int[] a = {0,1,2,3,4,5};
        int[] b = {0,1,2,3,4,5};
        int[][] dp = new  int[n+1][2];
        int even = 0;
        int odd = 1;
        dp[0][even] =0;
        dp[0][odd] =0;


        for(int i = 1; i<=n ; i++){
            if(a[i] % 2 == 0 ){
                dp[i][even] += dp[i-1][even];
                dp[i][odd] += dp[i-1][even];

            }else {
                dp[i][even] += dp[i-1][odd];
                dp[i][odd] += dp[i-1][odd];

            }

            if(b[i] % 2 == 0 ){
                dp[i][even] += dp[i-1][even];
                dp[i][odd] += dp[i-1][even];

            }else {
                dp[i][even] += dp[i-1][odd];
                dp[i][odd] += dp[i-1][odd];

            }



        }


        System.out.println(dp[n][even] );
        System.out.println(dp[n][odd] );


    }
}
