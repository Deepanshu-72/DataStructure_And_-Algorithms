import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("hello");

//        for (int n=1; n<=5; n+=1){
//            System.out.println(n);
//        }

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int n = 0; n <=num ; n++) {
            System.out.println(n);
        }
   }
}