public class Rbs {
    public static void main(String[] args) {

    }


   static int search(int[] arr, int target){
       int pivot = findpivot(arr);
       if (pivot==-1){
           return bsearch(arr,target,0, arr.length-1);
       }


       if (arr[pivot]==target){
           return pivot;
       }

       if (arr[pivot]<target){
           return -1;
       }

       int tem = bsearch(arr, target,0,pivot-1);
       if(tem==-1){
           return bsearch(arr, target,pivot+1,arr.length-1);
       }else {
           return tem;
       }



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

    static int bsearch(int[] arr, int target, int s, int e){

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

