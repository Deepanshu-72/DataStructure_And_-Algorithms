public class HCF {

    public static int calculate(int n1, int n2){
       while(n2 != 0){
           int temp = n2;
           n2 = n1%n2;
           n1 = temp;
       }

       return n1;
    }

    public static void main(String[] args) {
       int ans = calculate(14,18);
        System.out.println(ans);
    }
}
