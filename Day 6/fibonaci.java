import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        // Write a program to print Fibonacci series of n terms where n is input by user :
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of terms :");
        int n = sc.nextInt();

        System.out.print("Fibonacci Series: " + "0 " + "1 ");
        fibonacci(n);

    }

    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;

        for (int i = 2; i < n; i++) {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;
            b = nextTerm;
        }
    }
    
}
