import java.util.Arrays;
import java.util.Scanner;

public class CodeCheif {

     static class pair{
        int a;
        int b;

        pair(int a, int b){
            this. a= a;
            this.b = b;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        long oldSum = 0;




        pair[] p = new pair[n];

        for(int i = 0; i<n; i++){
            int a= sc.nextInt();
            int b = sc.nextInt();

           p[i]= new pair(a,b);






        }

        Arrays.sort(p, (p1,p2) -> Integer.compare(Math.abs(p2.a - p2.b) , Math.abs(p1.a - p1.b)) );

        long ans = 0;


        for(pair o : p ){

            if(x > 0 && (o.a >= o.b || y == 0)){
                ans += o.a;
                x--;

            }else{
                ans += o.b;
                y--;
;
            }


        }

        System.out.println(ans);




    }
}
