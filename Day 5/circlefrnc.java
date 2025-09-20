import java.util.*;

public class circlefrnc {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the radius:");

         int  r = sc.nextInt();
         System.out.println("Circumfarence of the circle is :" + crfr(r));
    }

    public static int crfr(int a){
        int circumfarence =2 *22/7 * a;
        return circumfarence; 
    }
}