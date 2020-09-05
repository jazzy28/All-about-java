import java.util.*;
public class Main{

     public static void main(String []args){
        String person = "Jasmine";
        char[] arr = person.toCharArray();//returns character array
        System.out.println(Arrays.toString(arr)); 
        
        //character array to string
        String name = String.valueOf(arr);
        System.out.println(name);
        System.out.println(person);
     }
}
