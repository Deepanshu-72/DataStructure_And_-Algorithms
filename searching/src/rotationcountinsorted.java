public class rotationcountinsorted {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2,3};
        System.out.println(rc(arr));
    }
    static  int rc(int[] arr){
        int pivt = findpivot(arr);
        if(pivt== arr.length-1){
            return arr.length;
        }
        if(pivt== -1){
            return 0;
        }
        return pivt+1;
    }
    static int findpivot(int[] arr){
        int s=0;
        int e=arr.length -1;
        while (s<=e) {
            int mid = s + (e - s) / 2;
            if (mid<e && arr[mid+1]<arr[mid]){
                return mid;
            }
            if (mid>s && arr[mid-1]>arr[mid]){
                return mid-1;
            }

            if (arr[s]>=arr[mid]){
                e = mid-1;
            }else {
                s=mid + 1;
            }
        }
        return -1;

    }
}
