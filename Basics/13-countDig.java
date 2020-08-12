///count digits
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int count = 0; //digits
    while(a != 0){
        a = a/10;
        count++;
    }
    System.out.println(count);
   }
  }