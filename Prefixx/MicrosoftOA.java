public class MicrosoftOA {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 4, 5};
        System.out.println(solve(arr));

    }

     static int solve(int [] arr){
        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        right[n-1]= 0;


        for(int i = n-2; i>=0 ; i--){
            if(arr[i+1]>=arr[i]){
                right[i]= right[i+1]+1;

            }
            else {
                right[i]=0;
            }
        }


        left[0]= 0;

        for (int i = 1; i<n; i++){

            if (arr[i-1]>=arr[i]){
                left[i] = left[i-1]+1;
            }
            else {
                left[i]= 0;
            }
        }
        int ans = 0;
        for (int i = 0 ; i<n; i++){
             ans = Math.max(ans, left[i]+right[i]+1);


        }

        return  ans;

    }
}
