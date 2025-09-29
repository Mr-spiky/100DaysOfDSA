public class SubString {
    public static void main(String args[]){

        String sentance = "My name is spiky";
        // substring(beg index , end index);
        String name = sentance.substring(11 , sentance.length());
        System.out.println(name);

        //String are immutable
    }
}
