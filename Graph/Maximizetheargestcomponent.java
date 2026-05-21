import java.util.HashSet;
import java.util.Scanner;

public class Maximizetheargestcomponent {
    static int[][] comp ;
    static String[][] G;
    static int[][] visited;
    static int[] count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long max = Long.MAX_VALUE;
        int t = sc.nextInt();
        while (t-- >0){
            int n= sc.nextInt();;
            int m = sc.nextInt();
             G = new String[n][m];
            for(int i =0 ; i<n; i++){
                for(int j= 0 ; j<m; j++){
                    G[i][j] = sc.next();
                }
            }

            int compn = 0;
            comp = new int[n][m];
            count= new int[n*m];

             visited = new int[n][m];

            for(int i =0 ; i<n; i++){
                for(int j= 0 ; j<m; j++){
                    if(G[i][j].equals("#")  && visited[i][j] == 0){
                        compn++;
                        bfs(i, j , compn, n, m);
                    }
                }
            }


            for(int i =0 ; i<n; i++){
                for(int j= 0 ; j<m; j++){
                    count[comp[i][j]]++;

                }
            }


            for(int i =0 ; i<n; i++){
                int c = 0;
                HashSet<Integer> map = new HashSet<>();
                for(int j= 0 ; j<m; j++){
                   if(comp[i][j] == 0){
                       c++;
                   }else {
                       map.add(comp[i][j]);
                   }


                }

                if(i-1>=0){
                    int x = i-1;
                    for(int j = 0 ; j<m; j++){
                        map.add(comp[x][j]);
                    }
                }

                if(i+1<n){
                    int x = i+1;
                    for(int j = 0 ; j<m; j++){
                        map.add(comp[x][j]);
                    }
                }

                for(int val : map.stream().toList()){
                    long y = 0 ;
                    if(val != 0){
                        y += count[val];
                    }
                    y += c;

                    max = Math.max(max, y);

                }


            }






        }
    }

    static void bfs(int i , int j, int compn, int n, int m){
        visited[i][j] = 1;
        comp[i][j] = compn;

        if(i-1>=0){
            bfs(i-1, j, compn, n, m);

        }
        if(i+1<n){
            bfs(i+1, j, compn, n, m);

        }

        if(j+1<n){
            bfs(i, j+1, compn, n, m);

        }

        if(j-1>=0){
            bfs(i, j-1, compn, n, m);

        }


    }
}
