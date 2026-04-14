import java.util.Scanner;

public class CourseWishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] b = new int[n+1];
            int[] a = new int[k+2];
            for(int i = 1; i<=k+1; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 1; i<=n; i++){
                b[i] = sc.nextInt();
            }
        }
    }
}
