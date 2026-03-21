import java.util.HashMap;
import java.util.Scanner;

public class MediaNet {
    static int n;
    static int[][] mat, c ;
   static boolean[][] vist ;
    static int[] dx = {-1, 1, 0, 0}; // up, down
    static int[] dy = {0, 0, -1, 1};
    static int comp =0;



    public static  void  dfs(int i , int j, HashMap<Integer, Integer> map){

        vist[i][j]= true;
        int x = mat[i][j];
        map.put(x, map.getOrDefault(x,0)+1);
        c[i][j] = comp;


        for (int dir = 0; dir < 4; dir++) {
            int nx = i + dx[dir];
            int ny = j + dy[dir];

            if (nx >= 1 && nx <= n && ny >= 1 && ny <= n &&
                    !vist[nx][ny] && mat[nx][ny] > 0) {
                dfs(nx, ny, map);
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        mat = new int[n+1][n+1];
        vist = new boolean[n+1][n+1];
        int[][] ans = new int[n+1][n+1];

        HashMap<Integer, Integer>[] maps = new HashMap[n+1];


        for(int i = 1 ; i<=n; i++){
            for (int j = 0 ; j<=n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 1 ; i<=n; i++){
            for (int j = 1 ; j<=n; j++){
                if(mat[i][j] != -1 && !vist[i][j] ){
                    comp++;
                    HashMap<Integer, Integer> map = new HashMap<>();
                    dfs(i, j, map);
                    maps[comp] = map;

                }
            }
        }


        for(int i = 1 ; i<=n; i++){
            for (int j = 0 ; j<=n; j++){
                if(mat[i][j] != -1 ){
                    int x = c[i][j];
                    for(int k =1; k<= comp; k++){
                        if(k != x) {
                            int curr = mat[i][j];
                            int d = 0;
                            int jd = curr;

                            while (j <= 1_000_000) {
                                d += maps[k].getOrDefault(j, 0);
                                jd += curr;
                            }

                            d *= maps[x].get(mat[i][j]);
                            ans[i][j] = d;

                        }





                    }
                }
            }
        }


        System.out.println(ans);






    }
}
