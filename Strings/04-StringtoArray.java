//string to array
import java.util.*;
public class Main{

     public static void main(String []args){
        String person = "Jasmine";
        char[] arr = person.toCharArray();//returns character array
        System.out.println(Arrays.toString(arr)); 
        //arrays are mutable
        arr[0] = 'K';
        System.out.println(Arrays.toString(arr)); 
     }
}
