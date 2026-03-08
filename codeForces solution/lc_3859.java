import java.util.HashMap;

public class lc_3859 {

    public static void main(String[] args) {
        int[] arr = {2,2,2,1,1,2,2,3,3};
        int k = 2;
        int m = 2;
        long ans = countSubarrays(arr, k, m);
        System.out.println(ans);


    }


        public static long countSubarrays(int[] nums, int k, int m) {

            int i = 0;
            int n = nums.length;
            long count = 0;

            HashMap<Integer,Integer> map = new HashMap<>();

            for(int j = 0; j < n; j++){

                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

                while(map.size() > k){
                    int y = nums[i];
                    map.put(y, map.get(y) - 1);
                    if(map.get(y) == 0) map.remove(y);
                    i++;
                }

                if(map.size() == k){
                    boolean valid = true;

                    for(int v : map.values()){
                        if(v < m){
                            valid = false;
                            break;
                        }
                    }

                    if(valid){

                        count++;



                    }
                }
            }

            return count;

        }

}
