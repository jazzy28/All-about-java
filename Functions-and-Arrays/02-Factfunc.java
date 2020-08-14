//Factorial function
import java.util.*;

public class Main{
     public static int fact(int x){
         int rv  = 1; //return value
         for(int i = 1; i<=x; i++){
             rv *= i;
         }
         return rv;
     }
     public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        
        int nfact = fact(n);
        int nmrfact = fact(n-r);
        
        int npr = nfact/nmrfact;
        System.out.println(n + "P" + r + " = " + npr);
     }
}