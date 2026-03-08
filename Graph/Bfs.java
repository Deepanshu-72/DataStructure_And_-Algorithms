import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs {

    static  int[] used = new int [1005];
   static ArrayList<Integer>[] G = new ArrayList[1005+1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i<=n; i++){
            G[i] = new ArrayList<>();

        }


        int i =0;
        while (i<=m) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            G[x].add(y);
            G[y].add(x);
            i++;

        }


    }
    public static  void bfs(int source){
        used[source]  = 1;
        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        while (!queue.isEmpty()){
            int node = queue.poll();
            for (int n : G[node] ){
                if(used[n] != 1){
                    used[n ] =1;
                    queue.add(n);


                }
            }


        }


    }
}
