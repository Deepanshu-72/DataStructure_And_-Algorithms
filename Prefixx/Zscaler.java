import java.util.TreeMap;

public class Zscaler {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        System.out.println(solve(arr));

    }

    static int solve(int arr[]){
        TreeMap<Integer, Integer>map = new TreeMap<>();

        for (int i =0; i< arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1 );
        }
        int operations = 0;
        while(map.size()!=1) {

            int largest = map.lastKey();
            int sec = map.lowerKey(largest);


            int freq = map.get(largest);
            operations += freq;

            map.put(sec, map.get(sec)+map.get(largest));
            map.remove(largest);

        }

        return operations;
    }
}
