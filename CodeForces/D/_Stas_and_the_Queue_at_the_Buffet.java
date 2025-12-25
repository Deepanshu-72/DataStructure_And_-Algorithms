import java.util.*;

public class _Stas_and_the_Queue_at_the_Buffet {
    static class Person {
        long a, b;
        Person(long a, long b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person[] arr = new Person[n];

        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            arr[i] = new Person(a, b);
        }

        // same greedy idea: sort by (a - b) descending
        Arrays.sort(arr, (x, y) ->
                Long.compare((y.a - y.b), (x.a - x.b))
        );

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i].a * i;           // (k - 1)
            sum += arr[i].b * (n - i - 1); // (n - k)
        }

        System.out.println(sum);
    }
}
