import java.util.Scanner;

public class The67thIntegerProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int x = sc.nextInt();
            int y = x+1;
            if(y>67 || y<-67){
                System.out.println(x);
            }
            else{
                System.out.println(y);
            }
        }
    }
}
