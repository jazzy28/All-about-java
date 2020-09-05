import java.util.*;
public class Main{

     public static void main(String []args){
        String person = "Jasmine";
        char[] arr = person.toCharArray();//returns character array
        System.out.println(Arrays.toString(arr)); 
        String name = String.valueOf(arr);
        System.out.println(name);
        System.out.println(person);
        
        //Substring
        System.out.println(name.substring(1));
        System.out.println(name.substring(2, 7));//start index, end-1
     }
}
