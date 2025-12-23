import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMaxSumOfSubtree {
    static long[] sum;
    static int[] b;


    public static void dfs(int node , List<Integer>[] G, int[] used, int[] parent){

        used[node]=1;

        for (int u : G[node]){
            if(used[u]==0){
                used[u]= 1;

                parent[u] = node;

                dfs(u, G, used, parent);
            }
        }

        long s = 0;

        for (int child : G[node]){
            if(child == parent[node]){
                continue;
            }else {
                s = Math.max(s, sum[child]);
            }


        }

        sum[node]= b[node] + s;





     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        b = new int[n + 1];
        sum = new long[n + 1];



        List<Integer> [] G = new List[n+1];


        for (int i = 1; i <= n; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 1; i<= n; i++){
            G[i]= new ArrayList<>();

        }

        for (int i = 1; i<= n-1; i++){

            int x = sc.nextInt();
            int y = sc.nextInt();

            G[x].add(y);
            G[y].add(x);
        }

        int [] used = new int[n+1];
        int [] parent = new int[n+1];



        dfs(1,G,used,parent);


        long answer = -100000000000000L;
        for (int i = 1; i <= n; i++) {
            answer = Math.max(answer, sum[i]);
        }

        System.out.println(answer);



    }


}
