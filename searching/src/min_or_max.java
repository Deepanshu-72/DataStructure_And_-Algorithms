public class min_or_max {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,55,88,99,333,66,8765,-12,345678,-9};
        System.out.println(min(nums));
    }

    static int min(int[] arr){
        int min = arr[0];
        int i=1;
        for ( i=1; i< arr.length; i++){

            if(arr[i]<min){
                min=arr[i];

            }
        }
        return i;
    }
}
