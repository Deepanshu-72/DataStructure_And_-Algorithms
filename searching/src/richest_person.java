public class richest_person {
    public static void main(String[] args) {
        int[][] acc = {
                {1,2,3},
                {3,2,1},
                {1,3,5,7,9}
        };
         int tol = maximumWealth(acc);
        System.out.println(tol);
    }

    static int maximumWealth(int[][] acc){
        int ans = Integer.MIN_VALUE;
        for (int row = 0; row < acc.length; row++) {
            int sum =0;
            for (int col = 0; col <acc[row].length ; col++) {

                sum = acc[row][col]+sum;

            }
            if(sum>ans){
                ans = sum;
            }

        }
        return ans;
    }
}
