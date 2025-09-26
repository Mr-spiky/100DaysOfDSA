import java.util.*;

public class searchnum {
    public static void main(String[] args){

        //take a matrix as input and search for a given number x and print the location if found else print not found

        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter rows number:");
        int rows = sc.nextInt();
        System.out.println("Eneter Cols number:");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        for(int i = 0 ; i<rows ; i++){
            for(int j= 0 ; j<cols ; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter  Number for Search:");
        int x = sc.nextInt();

        for(int i = 0; i<rows ; i++){
            for(int j =0 ; j<cols ; j++){
                if(numbers[i][j] == x){
                    System.out.println("Number " + x+" is found on location :"+ i+"," + j);
                }
            }
        }

    }
    
}
