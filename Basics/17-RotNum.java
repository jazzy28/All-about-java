//Rotate the number
import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     
     int n = scn.nextInt(); //number
     int k = scn.nextInt(); //number of times to rotate
     
     //count number of digits
     int temp = n;
     int nod = 0; //number of digits
     
     while(temp > 0){
         temp = temp/10;
         nod++;
         
     }
     k = k % nod; // spl cases, for large no.
     if(k<0){ //-ve no
         k = k + nod;
     }
     
     int div = 1;
     int multiplier = 1;
     
     for(int i = 1; i <= nod; i++){
        if(i<=k){
            div = div*10;
        }else{
            multiplier = multiplier *10; // i>k
        }
     }
     int q = n / div;
     int r = n % div;
     
     r = r*multiplier + q;
     System.out.println(r);
     
    }
   }