import java.util.*;

public class sumodd {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter nth odd number for sum:");
    int n = sc.nextInt();
    System.out.println("Nth odd number Sum is:" + oddsum(n));
    
}

public static int oddsum(int a){
    int sum = 0;
    for(int i = 1; i <= a ; i++){
        if(i % 2 != 0){
            sum += i;
        }
    }
    return sum;
}
    

}
