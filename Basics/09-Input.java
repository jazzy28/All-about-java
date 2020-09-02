import java.util.*;
//scn is a variable of type Scanner, that takes input from user
//import java.util.Scanner; - actual library for input
public class Input{
     public static void main(String[] args){
     //Integer
     Scanner scn = new Scanner(System.in); //initialization of Scanner
     int n = scn.nextInt(); //value from keyboard goes to variable n , n = 4
     for(int i = 0; i<=n; i++){
          System.out.println(i); // o/p: 0, 1, 2, 3, 4
     }
     //String
     String name = scn.nextLine(); // i/p: Jasmine A
     System.out.println("Hello " + name); // o/p: Hello Jasmine A

     //Integer and String both
     int n = Integer.parseInt(scn.nextLine()); // when want to input int and string together. Otherwise, it will not work, as in name of user will not be printed, i/p: 5
     
     String name = scn.nextLine(); // i/p: Jasmine A
     System.out.println("Dear " + name + " . Here is the counting:"); //o/p: Dear Jasmine A . Here is the counting: 1, 2, 3, 4, 5
     
     for(int i = 1; i<=n ; i++){
         System.out.println(i);
                               
 }
}
