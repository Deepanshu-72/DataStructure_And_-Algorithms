public class AmazonOA {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -1, 2};
        System.out.println(solve(arr));

    }

    static int solve(int[] arr){
        int t = 0;
        int n = arr.length;
        int [] prefixx = new int[n];
        int [] sufixx = new int[n];

        prefixx[0]=Math.max(0, arr[0]);
        sufixx[n-1]=Math.max(0,arr[n-1]);

        for(int i =1; i<n;i++){
            prefixx[i]= Math.max(prefixx[i-1]+arr[i],Math.max(arr[i],Math.max(prefixx[i-1],0 )) );
        }

        for(int i =n-2; i>=0;i--){
            sufixx[i]= Math.max(sufixx[i+1]+arr[i],Math.max(arr[i],Math.max(sufixx[i+1],0 ) ) );
        }


        for (int i =0; i<n-1; i++){
            int max = prefixx[i]+sufixx[i+1];
            t = Math.max(t,max);


        }

        return t;
    }

}
