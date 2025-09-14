public class rectangle {

    public static void main(String args[]){

        // print reactangle
        //Outer Loop
        //  for(int i =1 ; i<=5 ; i++){

        //     //inner loop
        //     for(int j=1 ; j<= 5 ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // print hollow reactangle
        int n =5 ;
        int m = 5 ;
        for(int i =1 ; i<=n ; i++){
            //inner loop
            for(int j =1 ; j<=m ; j++){
                if(i == 1 || i == n || j ==1 || j == m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    
}
