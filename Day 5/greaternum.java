import java.util.Scanner;

public class greaternum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
         System.out.println("Greater number is ; " + greater(num1,num2));
    }

    public static int greater(int a , int b){
        if(a<b){
          return b;
        }
        return a;
    }
}
