import java.util.HashMap;

public class CountMaxMinLength {

    public static void main(String[] args) {
        int[] arr = {1, -1, 0, 3, 1, 2, -2, 3};
        int k = 3;

        int[] result = solve(arr, k);
        System.out.println("Max length: " + result[0] + ", Count: " + result[1]);
        System.out.println("Min length: " + result[2] + ", Count: " + result[3]);

    }
    static int[] solve(int[] arr, int k){
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();
        int max=0;
        int maxCount = 0;
        int min= Integer.MAX_VALUE;
        int minCount = 0;

        int prefix =0;
        first.put(0,-1);
        last.put(0,-1);

        for(int i =0 ; i< arr.length; i++){
            prefix += arr[i];

            int x = prefix-k;

            if(first.containsKey(x)){
                int j= first.get(x);
                if(max<i-j){
                    max= i-j;
                    maxCount=1;
                }
                if(max==i-j){

                    maxCount+=1;
                }

            }

            if(last.containsKey(x)){
                int j= last.get(x);
                if(min>i-j){
                    min= i-j;
                    minCount=1;
                }
                if(min==i-j){

                    minCount+=1;
                }

            }

            first.putIfAbsent(prefix,i);

            last.put(prefix, i);
        }
        return new int[]{max, maxCount, min, minCount};
    }
}
