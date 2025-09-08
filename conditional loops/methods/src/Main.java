import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   //    int ans = sum(10,20);
     //   System.out.println(ans);
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String presonal = greet(name);
        System.out.println(presonal);
   }

     static String greet(String name) {

         String mssg = "hello " + name;
         return mssg;
    }

    static int sum(int a, int b){
        int sum = a+b;
        return sum;

   }
}