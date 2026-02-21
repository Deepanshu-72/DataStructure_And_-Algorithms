import java.util.Scanner;

public class Heapify_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            int[] track = new int[n+1];
            boolean found = true;
            for(int i = 1 ; i<=n ; i++){
                arr[i] = sc.nextInt();
                if(arr[i] != i){
                    track[i] = 1;
                }
            }

            for (int i = 1; i<=n/2 ; i++){
                if(track[i] == 1 ){
                    if( arr[i] == 2 * i && arr[i *2 ] == i ){
                        track[i] = 0;
                        track[2 * i ] = 0;
                    }else found = false;
                }

            }

            for (int i = n/2+1; i<=n ; i++){
                if(track[i] == 1 ){

                        found = false;

                }

            }
            System.out.println(found ? "yes" : "no");
        }
    }
}
