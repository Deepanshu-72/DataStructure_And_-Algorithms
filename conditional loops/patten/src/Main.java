//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        pattern(5);
    }

    static void pattern(int n){

        for(int i =0; i<=2*n-1; i++){
            if(i <= n) {
                for(int j =1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for (int col = 1; col <= i; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int j =1; j<=i-n; j++){
                    System.out.print(" ");
                }

                for (int col =1; col<= 2*n-i; col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }

}