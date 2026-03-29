import java.util.Scanner;

public class Kadens {//

    // 1 st and 2nd max subarray without intersecting
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n+1];

        for(int i = 1; i<= n; i++){
            arr[i] = sc.nextInt();
        }

        int[] p = new int[n+1];
        int[] s = new int[n+1];

        for(int i = 1; i<=n; i++){
            p[i] = Math.max(p[i-1]+arr[i],arr[i]  );
            p[i] = Math.max(p[i],p[i-1] );

        }
        s[n] = arr[n];
        for(int i = n-1; i>=1; i--){
            s[i] = Math.max(s[i+1]+arr[i],arr[i]);
            s[i] = Math.max(s[i],s[i+1] );

        }

        int ans = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++){
            ans = Math.max(ans, p[i] + s[i+1]);
        }
        System.out.println(ans);


    }
}
