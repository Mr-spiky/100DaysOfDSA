import java.util.*;
public class Recursion2 {
    //print number from 1 to 5
    public static void printNumbers(int n) {
        if(n == 6) {
            return;
        }
        System.out.print(n + " ");
        printNumbers(n + 1);
    }
   public static void main(String[] args) {
    int n = 1 ;
    printNumbers(n);
   }
}