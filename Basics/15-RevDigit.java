//reverse a digit
import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     
     while (n > 0){
         int div = n%10; //remainder
         n = n/10; //752 ->75
         System.out.println(div);
         
     }
    }
   }