import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  
  int inv = 0; //inverse
  int op = 1; //original place
  while(n != 0){ // or n>0
    int od = n%10;//original digit
    int id = op; //inverted digit
    int ip = od; // inverted position
    
    //make change to inv using ip and id
    inv = inv + id*(int)Math.pow(10, ip-1);
    
    n = n/10; //reducing the no.
    op++;
      
  }
  System.out.println(inv);
 }
}