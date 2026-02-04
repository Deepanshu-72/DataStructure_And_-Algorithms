import java.util.Arrays;
import java.util.Scanner;

public class Restricted_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = b[i] = sc.nextInt();
            }

            Arrays.sort(b);

            long ans = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    ans = Math.min(ans, Math.max(a[i] - b[0], b[n-1] - a[i]));
                }
            }
            if(ans == Integer.MAX_VALUE){
                System.out.println(-1);
            }else System.out.println(ans);


        }
    }
}
