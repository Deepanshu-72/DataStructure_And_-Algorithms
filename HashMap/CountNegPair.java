import java.util.HashMap;

public class CountNegPair {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int k = 6;
        System.out.println(count(arr, k));

    }

    static int count(int arr[], int k){
        int count =0 ;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i= arr.length-1 ; i>= 0; i--){
            int need = arr[i] - k;

            if(map.containsKey(need)){
                count += map.get(need);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0)+1 );
        }

        return count;

    }
}
