import java.util.*;
public class SimplySittingonChairs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            int count = 0;

            int[] arr = new int[n + 1];
            int[] ch = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    System.out.println(count);
                    break;
                }

                if (arr[i] <= i) {
                    count++;
                    ch[arr[i]] = 1;
                }
            }

            System.out.println(count);

        }


    }
}
