import java.util.*;
public class Main{

     public static void main(String []args){
        String person1 = "Jasmine";
        String person2 = "Jasmine";
        System.out.println(person1 == person2); //true: compared references
        System.out.println(person1.equals(person2)); //for strings, compare values
        
     }
}
