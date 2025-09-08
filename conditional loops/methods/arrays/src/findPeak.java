public class findPeak {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,7,6,5,4,3,2,1};
        int ans = bsearch(arr);
        System.out.println(ans);

    }
    static int bsearch(int[] arr){


        int s=0;
        int e=arr.length -1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return arr[mid];
            } else if (arr[mid] > arr[mid+1]) {
                e =mid;

            }
            else {
                s=mid+1;

            }
        }
        return -1;
    }
}
