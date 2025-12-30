import java.util.*;

public class DancingPenguine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] m = new  int[n];
        int [] f = new int[n];


        for(int i = 0; i<n; i++){
            m[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            f[i] = sc.nextInt();
        }

        ArrayList<Integer> p1M= new ArrayList<>();

        ArrayList<Integer> p2M= new ArrayList<>();

        ArrayList<Integer> p1F= new ArrayList<>();

        ArrayList<Integer> p2F= new ArrayList<>();


        for(int i = 0 ; i<n; i++){
            if(m[i]<0){
                p1M.add(m[i]);
            }else {
                p2M.add(m[i]);


            }
        }

        for(int i = 0 ; i<n; i++){
            if(f[i]<0){
                p1F.add(f[i]);
            }else {
                p2F.add(f[i]);


            }
        }

        Collections.sort(p1M);
        Collections.sort(p2M);
        Collections.sort(p1F);
        Collections.sort(p2F);

        int count = 0;


        int i = 0, j = 0;
        while (i < p1M.size() && j < p2F.size()) {
            if (p1M.get(i) > p2F.get(j)) {
                count++;
                i++;
                j++;
            } else {
                i++;
            }
        }

        // p2M vs p1F
        i = 0;
        j = 0;
        while (i < p2M.size() && j < p1F.size()) {
            if (p2M.get(i) > p1F.get(j)) {
                count++;
                i++;
                j++;
            } else {
                i++;
            }
        }
        System.out.println(count);





    }
}
