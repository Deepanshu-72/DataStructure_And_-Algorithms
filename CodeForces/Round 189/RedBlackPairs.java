import java.util.Scanner;

public class RedBlackPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0 ){
            int n = sc.nextInt();
            int[][] arr = new int[2][n+1];

                String s1 = sc.next();
                String s2 = sc.next();
                char[] char1 = s1.toCharArray();
                char[] char2 = s2.toCharArray();

                for(int i = 0 ; i<n ; i++){
                    if(char1[i] == 'R' ){
                        arr[0][i+1] = 1;
                    }
                }

                for(int i = 0 ; i<n ; i++){
                    if(char2[i] == 'R' ){
                        arr[1][i+1] = 1;
                    }
                }



            int[] dp = new int[n+1];

            dp[0] =0 ;


            for(int i = 1; i<=n ; i++){
                int z = 0;
                if(arr[0][i] != arr[1][i]){
                    z = 1;
                }
                int x = dp[i-1] + z;

                int  y = Integer.MAX_VALUE;
                if(i>= 2){
                    int  w =0;
                    if(arr[0][i] != arr[0][i-1]){
                        w++;
                    }
                    if(arr[1][i] != arr[1][i-1]){
                        w++;
                    }
                    y = dp[i-2]+w;
                }

                dp[i] = Math.min(x, y);

            }
            System.out.println(dp[n]);

        }
    }
}
