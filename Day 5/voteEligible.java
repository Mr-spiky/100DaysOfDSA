import java.util.*;

public class voteEligible {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("You are eligible for Vote ");
        }else{
            System.out.println("Sorry , You are not eligible for vote");
        }
    }
}