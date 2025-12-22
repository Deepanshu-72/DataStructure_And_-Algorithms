import java.util.*;

public class ShortestPathWithCount1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] b= new  int[n+1];



        for( int i = 1; i<=n ; i++){
            b[i]= sc.nextInt();
        }

        List<Integer>[] G= new ArrayList[n+1];
        for (int i = 1 ; i<= n; i++){
            G[i]= new ArrayList<>();
        }

        for (int i = 1; i<= n-1; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            G[x].add(y);
            G[y].add(x);
        }




    }

    int[] bfs(List<Integer>[] G, int [] b, int n){
        Queue<Integer> q = new LinkedList<>();
        int[] used = new int[n + 1];
        used[1] = 1;
        q.add(1);
        int[] answer = new int[n + 1];
        answer[1] = b[1];

        while(!q.isEmpty()){
            int v = q.poll();
            for (int u : G[v]){
                if(used[u]== 0){
                    used[u] = 1;
                    q.add(u);
                    if(b[u] == 1){
                        answer[u] = answer[v]+1;
                    }else{
                        answer[u] = answer[v];

                    }

                }
            }
        }

        return answer;
    }


}
