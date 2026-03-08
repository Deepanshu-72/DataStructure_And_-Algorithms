import java.util.Scanner;

public class TowersofBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){

            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();


            int h =(d/m) + 1;
            if(n%h == 0){
                System.out.println(n/h);
            }
            else {
                System.out.println((n/h) +1);
            }

        }
    }
}
