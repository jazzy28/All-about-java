import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    
    //checking greatest number
    int max = a; //assumption
    if(b>=max){
        max = b;
    }
    if(c>=max){
        max = c;
    }
    if(max == a){
        boolean flag = ((b*b + c*c) == (a*a)); //prints true or false
        System.out.println(flag);
    }
    else if(max == b){
        boolean flag = ((a*a + c*c) == (b*b));
        System.out.println(flag);
    }
    else{
        boolean flag = ((b*b + a*a) == (c*c)); 
        System.out.println(flag);
    }
    
   }
  }