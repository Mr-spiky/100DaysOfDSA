public class updatebit {
    public static void main(String args[]){
        int n = 5 ; 
        int pos = 1;
        int bitmask = 1 <<i;
        if(oper == 1){
            int newNumber = bitmask | n ;
            System.out.println(newNumber);
        }
        else{
            int newNumber = (~bitmask) & n ;
            System.out.println(newNumber);

        }
    }

}
