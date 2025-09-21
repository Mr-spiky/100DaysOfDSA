import java.util.*;

public class tillend {
    public static void main(String[] args) {
        // Write a program to enter the numbers till the user wants and at the end it
        // should display the count of positive, negative and zeros entered.
        Scanner sc = new Scanner(System.in);
        int positiveCOunt = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter Numbers for count And Zero for end :");

        int num = sc.nextInt();
        while (true) {
            if (num == 0) {
                break;
            } else if (num > 0) {
                positiveCOunt++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            num = sc.nextInt();
        }
        System.out.println("Positive Count: " + positiveCOunt);
        System.out.println("Negative Count: " + negativeCount);
        System.out.println("Zero Count: " + zeroCount);
    }

    
}