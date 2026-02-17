import java.util.*;

public class SieveofErato67henes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
          int n = sc.nextInt();
          boolean found = false;
          for(int i = 1 ; i<=n ; i++){
              int temp = sc.nextInt();
              if(temp == 67){
                  found = true;
              }
          }
            System.out.println(found ? "YES" : "NO");
        }
    }
}
