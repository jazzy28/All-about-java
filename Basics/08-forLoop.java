//to perform something repeatedly we do loops
//loop with initialization, increment/decrement, evaluation together
import java.util.*;

public class Loops{
     public static void main(String[] args){
       for(int i = 1; i<=9; i++){
       	System.out.println(i);
       }
       System.out.println("Done.");
}
}
//loops will always have 3 things: initialization, increment/decrement, evaluation

// in for loop: Initiation -> 2. Evaluation -> 3. Execution -> 4. Increment ->234.. 

//DO-WHILE LOOP
/*A third loop which is seldom used is the "do while" loop. In this loop, the block of statements are first executed and then the while condition is checked, just the opposite of while loop. In this loop, the block is executed at-least once as opposed by the other two loops.
    
            Structure:
            int i = 1;
            do{
                System.out.println(i);
                i++;
            }while(i <= 10);

Post Increment and Pre Increment
    
        Frequently, you would be encountering statements such as i++, i--, ++i or --i.
        The former two statements are known as post increments/decrements while the latter two are known as pre increments/decrements.
    
        i++ and ++i is equivalent to i = i + 1.
        i-- and --i is equivalent to i = i - 1.
        i++ increments the value of 'i' by 1 but still uses the original value.
        ++i first increments the value of 'i' and then uses the value of the variable.
    
        For example
        int i = 10;
        y = i++; // (Post increment)
        In this case, the initial value of 'i' is 10. The variable y is then assigned the value of 'i' i.e. 10 and the increases the value of 10. The final values of 'i' and 'y' would be 11 and 10 respectively.
    
        ----------------------------------------------------------------------------------------
        int i = 10;
        y = ++i; // (Pre Increment)
        The initial value of 'i' is 10.  The value of 'i' is first incremented and then assigned to the variable y. The final values of 'i' and 'y' would be 11 and 11 respectively.
        */