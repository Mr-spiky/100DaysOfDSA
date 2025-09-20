import java.util.*;

public class  avg {

    public static void main(String[] args) {
        // Enter 3 numbers from the user & make a function to print their average.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers separated by space: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("The average of these numbers is: " + average(num1, num2, num3));
    }

    public static int average(int a , int b , int c ){
        return (a + b + c) / 3;
    }
}

    