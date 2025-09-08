public class binaysearch {
    public static void main(String[] args) {
       int[] arr= {1,2,3,4,5,7,8,9};
         int ans = bsearch(arr,6);
        System.out.println(ans);

    }
    static int bsearch(int[] arr, int target){

        if (target > arr[arr.length-1]){
            return -1;
        }
        int s=0;
        int e=arr.length -1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                s =mid+1;

            }
            else {
                e=mid-1;

            }
        }
        return -1;
    }
}
