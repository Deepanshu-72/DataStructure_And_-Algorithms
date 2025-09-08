import java.util.Arrays;
import java.util.Scanner;

public class gptc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3]; // Declare a 3x3 array

        // Taking user input for the array
        System.out.println("Enter 9 elements for the 3x3 array:");
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = in.nextInt();
            }
        }

        // Printing the 2D array using Arrays.toString()
        System.out.println("2D Array:");
        for (int r = 0; r < arr.length; r++) {
            System.out.println(Arrays.toString(arr[r])); // Print each row as a string
        }

        in.close(); // Close Scanner
    }
}
