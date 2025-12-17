import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MaxMinSubArrayOfSumK {
    public static void main(String[] args) {
        int[] arr1 = {1, -1, 0, 3};
        int k1 = 3;

        int[] result1 = solve(arr1, k1);
        System.out.println("Array: " + Arrays.toString(arr1) + ", k = " + k1);
        System.out.println("Max length: " + result1[0] + ", Min length: " + result1[1]);

    }
     static int[] solve(int[] arr, int k){
         HashMap<Integer, Integer> first = new HashMap<>();
         HashMap<Integer, Integer> last = new HashMap<>();
         int max=0;
         int min= Integer.MAX_VALUE;

         int prefix =0;
         first.put(0,-1);
         last.put(0,-1);
         for (int i = 0; i<arr.length; i++){
             prefix +=arr[i];



             int x = prefix-k;
             if(first.containsKey(x)){
                 int j = first.get(x);
                 max = Math.max(i-j, max);
             }

             if(last.containsKey(x)){
                 int j = last.get(x);
                 min = Math.min(i-j, min);
             }

             first.putIfAbsent(prefix,i);

             last.put(prefix, i);
         }


         return new int[]{max, min};




     }
}
