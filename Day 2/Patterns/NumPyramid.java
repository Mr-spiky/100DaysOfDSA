public class NumPyramid{

    public static void main(String args[]){

        //print half pyramid with numbers


        // int n= 5 ;
        // int number = 1;
        // for(int i=1 ; i<=n ;i++){
        //     for(int j = 1 ; j<=i ; j++){
        //         System.out.print(number + " ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        //Print inver form of half pyramid number
        
        // int n= 5 ;
        // int number = 1;
        // for(int i=1 ; i<=n; i++){
        //     for(int j= 1; j<=i ; j++){
        //         System.out.print(number + " ");
        //         number++;
        //     }
        //     System.out.println();
        // }


        //Print in 0,1 fromat

        // int n = 5 ;
        // for(int i = 1 ; i<=n ; i++){
        //     for(int j =1 ; j<=i ; j++){
        //         int sum = i + j;
        //         if( sum % 2 == 0){
        //             System.out.print( 1 + " ");
        //         }else{
        //             System.out.print( 0 + " ");
        //         }
        //     }
        //     System.out.println();
        // }

        //print a solid rhombus

        int n = 5 ;
        for(int i =1 ; i<=n ; i++){
            for(int j =1 ; j<=n -i;j++){

                    System.out.print(" ");
                }
               

                for(int k= 1 ; k<=n;k++){
                    System.out.print("* ");
                }
            System.out.println();
        }



    }
}