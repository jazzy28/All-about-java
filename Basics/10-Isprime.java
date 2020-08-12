//Prime or not prime
import java.util.*;

  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt(); //no. of test cases
      
      for(int i = 0; i<t; i++){
        int n = scn.nextInt(); //no. of inputs
        int count = 0;
        for(int div = 2; div*div<=n; div++){ // running till sq.root
            if(n%div==0){
                count++;
                break; // even on 1 increment, it will be not prime
            }
        }
        if(count == 0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        }
      }
  
   }
  