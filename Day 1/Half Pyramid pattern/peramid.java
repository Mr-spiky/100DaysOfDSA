public class peramid {

    public static void main(String args[]) {

        // print halfpermaid
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("X");
        // }
        // System.out.println();
        // }

        // print upside down halfpermaid
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("X");
        // }
        // System.out.println();
        // }

        // print 180% fliped or upside down halfpermaid
        // int n = 5;
        // //OuterlOOp
        // for (int i = 1; i <= n; i++) {
        // //innerloop frto spce
        // for(int j=1 ; j<=n-i ; j++){
        // System.out.print(" ");
        // }

        // //innerloop
        // for(int j=1 ; j<= i ; j++){
        // System.out.print("X");
        // }
        // System.out.println();
        // }

        // print down halfpermaid with numbers

        // outer loop
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // print invert halfpermaid with numbers

        // outer loop
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i+1; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }


        // print invert halfpermaid with numbers

        // int n = 5;
        // int number=1 ;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(number +" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        //print half 0,1 triangle
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i+j;
                if( sum % 2 ==0){
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }

    }

}