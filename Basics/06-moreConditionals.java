//"if, else-if, else" stack

import java.utils.*;

public class moreConditionals{

     public static void main(String[] args){
        int n1 = 8; //initialization of variable n1
        int n2 = 8; //initialization of variable n2
        
        if(n1>n2)
        {
            System.out.println(n1 + " is greater than " + n2);
        }
        else if(n1 == n2)
        {
            System.out.println(n1 + " is equal to " + n2);
        }
        else
        {
            System.out.println(n2 + " is greater than " + n1);
        }
        
        System.out.println("Hardwork is better than smartwork.");
     }
}

//'=' is used to assign a value to a variable whereas '==' is used to check the value of a variable.
//To combine more than one condition in an if clause we can use logical operators - AND (&&), OR (||) and Not(!) e.g.