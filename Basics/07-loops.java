//to perform something repeatedly we do loops
import java.util.*;

public class Loops{
     public static void main(String[] args){
         int i = 1; //initialized
         while(i<=9){ // evaluation
             System.out.println(i);
             i++; // i = i+1-> w/t this there will be infinite loop, as condition will not be false , incremented
         }
            System.out.println("Done.");
     }
}

//loops will always have 3 things: initialization, increment/decrement, evaluation