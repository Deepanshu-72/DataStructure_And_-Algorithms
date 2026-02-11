import java.util.*;

public class Swiggy_Oa {

    static void dfs(int node, int parent, List<Integer>[] G, int[] subSum) {
        subSum[node] = node;

        for (int child : G[node]) {
            if (child == parent) continue;
            dfs(child, node, G, subSum);
            subSum[node] += subSum[child];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer>[] G = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            G[i] = new ArrayList<>();
        }

        // Read n-1 edges
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            G[u].add(v);
            G[v].add(u);
        }

        int[] subTreeSum = new int[n + 1];

        dfs(1, 0, G, subTreeSum);

        int totalSum = subTreeSum[1];
        int minDiff = Integer.MAX_VALUE;

        for (int i = 2; i <= n; i++) {
            int diff = Math.abs(totalSum - 2 * subTreeSum[i]);
            minDiff = Math.min(minDiff, diff);
        }

        System.out.println(minDiff);
    }
}
