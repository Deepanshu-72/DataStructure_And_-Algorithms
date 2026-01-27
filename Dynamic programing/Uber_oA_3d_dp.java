import java.util.Scanner;

public class Uber_oA_3d_dp {

       static long [][][] dp = new long[100000+5][5][5];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n+1];
        int [] d = new int[n+1];
        for(int i =1; i<=n; i++){
            b[i]= sc.nextInt();
            d[i] = sc.nextInt();

        }

        // base case
        dp[1][1][1] = b[1];
        dp[1][1][2] = b[1];
        dp[1][2][1] = d[1];
        dp[1][2][2] = d[1];

        for(int i = 2; i<=n ; i++){
            dp[i][1][1] = b[i] +b[i-1] + Math.max(dp[i-2][2][1] , dp[i-2][2][2]);
            dp[i][1][2] = b[i] +d[i-1] + Math.max(dp[i-2][2][1] , Math.max(dp[i-2][1][1] , dp[i-2][1][2]));
            dp[i][2][1] = d[i] +b[i-1] + Math.max(dp[i-2][1][2] , Math.max(dp[i-2][2][1] , dp[i-2][2][2]));
            dp[i][2][2] = d[i] +d[i-1] + Math.max(dp[i-2][1][1] , dp[i-2][1][2]);

        }

        System.out.println(Math.max(Math.max( dp[n][1][1],dp[n][1][2]), Math.max(dp[n][2][1],dp[n][2][2] )));
    }
}
