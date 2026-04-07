import java.util.Scanner;

public class MicrosoftOA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[][] = new  int[n+1][3];
        dp[0][0] = 1;
                dp[0][1] = 1;
                dp[0][2] = 1;

        dp[1][0] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;

        for(int i = 2; i<= n; i++){
            if (i - 1 >= 0) dp[i][0] += dp[i - 1][0];
            if (i - 2 >= 0) dp[i][0] += dp[i - 2][0];
            if (i - 6 >= 0) dp[i][0] += dp[i - 6][0];

            if (i - 1 >= 0) dp[i][1] += dp[i - 1][1];
            if (i - 2 >= 0) dp[i][1] += dp[i - 2][1];
            if (i - 4 >= 0) dp[i][1] += dp[i - 4][0];
            if (i - 6 >= 0) dp[i][1] += dp[i - 6][1];

            if (i - 1 >= 0) dp[i][2] += dp[i - 1][2];
            if (i - 2 >= 0) dp[i][2] += dp[i - 2][2];
            if (i - 4 >= 0) dp[i][2] += dp[i - 4][1];
            if (i - 6 >= 0) dp[i][2] += dp[i - 6][2];


        }


        long result = dp[n][0] + dp[n][1] + dp[n][2];
        System.out.println(result);

    }
}
