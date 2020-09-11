//string recursion
//subsequence
import java.util.*;

public class Main{
    public static void main(String[] args){
        String str = "abc";
        subseq("", str); //initially, processed string="" and unprocessed string = "abc"
        
    }
    public static void subseq(String proc, String unproc){
        if(unproc.isEmpty()){ //base case
           System.out.println(proc);
           return;
        }
        
        //taking out 1st char of unprocessed
        char ch = unproc.charAt(0);
        unproc = unproc.substring(1); //removal of 0th char; char 1 to end will remain
        subseq(proc + ch, unproc); //concatenating character to processed side
        subseq(proc, unproc); //remains the same
    }
}
