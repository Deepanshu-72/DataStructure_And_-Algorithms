public class searchInROtedArry {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2,3};
        int peak = findpeak(arr);
        int target = 2;
        int ans = bsearch(arr,target, 0, peak);
        if(ans != -1) {
            System.out.println(ans);
        }
        else {
            int ans1 = bsearch(arr,target, peak+1, arr.length);
            System.out.println(ans1);


        }

    }






    static int bsearch(int[] arr, int target , int s, int e){




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

    static int findpeak(int[] arr){


        int s=0;
        int e=arr.length -1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            } else if (arr[s] >= arr[mid]) {
                e =mid-1;

            }
            else {
                s=mid+1;

            }
        }
        return -1;
    }
}
