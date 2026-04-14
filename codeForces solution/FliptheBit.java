import java.util.Scanner;

public class FliptheBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=  sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            int v = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0; i<n; i++){
                arr[i] = sc.nextInt();

            }
            int k = sc.nextInt() - 1;
            int count = 0;
            int target = arr[k];

            int leftOps = 0;
            int leftFlip = 0;

            for (int i = 0; i < k; i++) {
                if ((arr[i] ^ leftFlip) != target) {
                    leftOps++;
                    leftFlip ^= 1;
                }
            }

            int rightOps = 0;
            int rightFlip = 0;

            for (int i = n - 1; i > k; i--) {
                if ((arr[i] ^ rightFlip) != target) {
                    rightOps++;
                    rightFlip ^= 1;
                }
            }

            int ans = Math.max(leftOps, rightOps);

            if (ans % 2 != 0) {
                ans++;
            }

            System.out.println(ans);
        }
    }
}
