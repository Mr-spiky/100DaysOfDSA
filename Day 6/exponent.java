import java.util.Scanner;

public class exponent {
    public static void main(String[] args) {
        //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter Base :");
       int baseNum  = sc.nextInt();
         System.out.println("Enter Power :");
       int powerNum = sc.nextInt();

       int result = power(baseNum, powerNum);
       System.out.println("Result: " + result);
   }

   public static int power(int base , int power){
    int result = 1 ;
    for(int i=1 ; i<= power ; i++){
        result *= base;
    }
    return result;
}

}
