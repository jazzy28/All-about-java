import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  
  for(int div = 2; div * div <=n ; div++){
      while (n % div == 0){
          n = n/div;
          System.out.print(div + "  ");
      }
      }
      if( n != 1){ //spl case: 46 = 2*23, we will not run till 23, we will directly divide by 23
      System.out.print(n); //printing the number itself
  }
 }
}

