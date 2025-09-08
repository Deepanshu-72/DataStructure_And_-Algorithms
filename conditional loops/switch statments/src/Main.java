import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekdays");

            case 6, 7 -> System.out.println("weekends");

            default -> System.out.println("enter valid day");

        }

    }
}