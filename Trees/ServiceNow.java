import java.util.ArrayList;
import java.util.Scanner;

public class ServiceNow {
    static final int MAXN = 100005;

    static ArrayList<Integer>[] tree = new ArrayList[MAXN];
    static int[] countSubtree = new int[MAXN]; // Number of nodes in the subtree of each node
    static int[] ans = new int[MAXN];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rel = new int[n-1];

        for(int i = 0 ; i<n-1; i++){
            rel[i]= sc.nextInt();
        }
        for (int i = 0; i < MAXN; i++) {
            tree[i] = new ArrayList<>();
        }

        for(int i = 1; i<n; i++){
            tree[rel[i]].add(i);
            tree[i].add(rel[i]);


        }

        dfsCount(0, -1);
        dfsAns(0, -1);
    }

    private static void dfsAns(int node, int parent) {

    }

    private static void dfsCount(int node, int parent) {
        countSubtree[node]= 1;
        for(int child : tree[node]){
            if(child != parent){
                dfsCount(child, node);
                countSubtree[node] += countSubtree[child];

            }
        }

    }
}
