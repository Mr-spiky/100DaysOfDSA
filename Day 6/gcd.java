import java.util.Scanner;

public class gcd {
    
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers :");
            int a = sc.nextInt();
            int b = sc.nextInt();
             System.out.println("GCD is : " + gcd(a,b));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            
            a = temp;
        }
        return a;
    }
}
