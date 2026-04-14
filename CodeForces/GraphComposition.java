import java.util.*;

public class GraphComposition {
    static void Gdfs(int v, ArrayList<ArrayList<Integer>> sl, int[] col, int c) {
        col[v] = c;
        for (int u : sl.get(v)) {
            if (col[u] == 0) {
                Gdfs(u, sl, col, c);
            }
        }
    }

    static int Fdfs(int v, ArrayList<ArrayList<Integer>> sl, int[] col, int[] old_col, int c) {
        col[v] = c;
        int res = 0;
        for (int u : sl.get(v)) {
            if (col[u] == 0) {
                if (old_col[u] != c) res++;
                else res += Fdfs(u, sl, col, old_col, c);
            }
        }
        return res;
    }

    static void readConList(ArrayList<ArrayList<Integer>> sl, int m, Scanner sc) {
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            sl.get(u).add(v);
            sl.get(v).add(u);
        }
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int mf = sc.nextInt();
        int mg = sc.nextInt();

        ArrayList<ArrayList<Integer>> fsl = new ArrayList<>();
        ArrayList<ArrayList<Integer>> gsl = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            fsl.add(new ArrayList<>());
            gsl.add(new ArrayList<>());
        }

        readConList(fsl, mf, sc);
        readConList(gsl, mg, sc);

        int[] fcol = new int[n];
        int[] gcol = new int[n];

        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (gcol[i] == 0) {
                Gdfs(i, gsl, gcol, i + 1);
            }
            if (fcol[i] == 0) {
                ans += Fdfs(i, fsl, fcol, gcol, gcol[i]);
                if (gcol[i] < i + 1) ans++;
            }
        }

        System.out.print(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = 1;
        boolean multi = true;
        if (multi) t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            solve(sc);
            System.out.println();
        }
    }


}
