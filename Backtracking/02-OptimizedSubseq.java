//StringBuilder : object can be edited, whereas, we cannot edit String
import java.util.*;

public class Main{
    public static void main(String[] args){
        String word = "abc";
        StringBuilder proc = new StringBuilder("");
        StringBuilder unproc = new StringBuilder(word);
        
        //unproc.insert(0, 'a');//adding character at 0th index
        //System.out.println(unproc);
        
        subseq(proc, unproc);
        
    }
    private static void subseq(StringBuilder proc, StringBuilder unproc){//processed unprocessed
        if(unproc.length() == 0){//base case
            if(proc.length() != 0){ //to skip empty
                System.out.println(proc); 
            }
            return;
        }
        char ch = unproc.charAt(0);
        
        unproc.delete(0, 1);//delete 0th index
        
        proc.append(ch); //adding to proc, same object
        subseq(proc, unproc);
        proc.delete(proc.length()-1, proc.length()); //backtracking, coming back to the. upper node
        
        subseq(proc, unproc);
        unproc.insert(0, ch);
    }
}
