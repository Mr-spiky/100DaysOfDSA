public class naturalNum {
    public static void printsum(int i , int n , int sum) {

        if(i == n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printsum(i+1, n, sum);
        
    }
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int i = 1;
        printsum(i, n, sum);
    }
}
