import java.util.Scanner;

public class StaminaandTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] c = new int[n];
            int[] p = new int[n];
            double[] dp = new double[n+1];

            dp[0] = 0;


            for(int i = 0; i<n; i++){

                c[i] = sc.nextInt();
                p[i] = sc.nextInt();
            }

            for(int i = 1; i<= n ; i++){

                double m = dp[i-1] + c[i-1] ;
                m = m*(1 - (p[i-1]/100));
                dp[i] = Math.max(dp[i-1], m);

            }

            System.out.println(dp[n]);


        }
    }
}
