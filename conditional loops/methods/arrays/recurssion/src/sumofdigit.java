public class sumofdigit {
    public static void main(String[] args) {
        System.out.println(sum(1342));

    }
    static  int sum(int n){
        if(n==0){
            return 0 ;
        }
        int rem = n%10;
        n = n/10;
        return rem + sum(n);
    }
}
