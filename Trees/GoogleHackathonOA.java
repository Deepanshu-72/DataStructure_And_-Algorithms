import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoogleHackathonOA {
    static ArrayList<Integer>[] G;
    static int[] dp, values, parent;

    static  void dfs(int node, int par){
        parent[node] = par;
        for(int child : G[node]){
            if(child != par){
                dfs(child,node);
            }
        }

        for (int u : G[node]){
            dp[node] += dp[u];

        }

        if(dp[node] == 0 && values[node] == 1){
            dp[node] = 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         values = new  int[n+1];
         parent = new int[n+1];

        for (int i =1; i<=n; i++){
            values[i] = sc.nextInt();
        }

         G = new ArrayList[n+1];
         dp = new  int[n+1];

        for(int i = 1; i<=n; i++){
            G[i] = new ArrayList<>();

        }


        for(int i = 1; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            G[x].add(y);
            G[y].add(x);
        }

        dfs(1, -1);

        System.out.println(dp[1]);



    }
}
