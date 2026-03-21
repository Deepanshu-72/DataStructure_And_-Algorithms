import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maxele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n * n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            int maxFreq = 0;
            for (int v : freq.values()) {
                maxFreq = Math.max(maxFreq, v);
            }

            if (maxFreq > n * (n - 1))
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
