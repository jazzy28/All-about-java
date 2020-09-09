import java.util.*;
public class Main{
    public static void main(String[] args){
        String word = "abc";
        StringBuilder proc = new StringBuilder("");
        StringBuilder unproc = new StringBuilder(word); //StringBuilder can be edited, String cannot be edited
        
        subseq(proc, unproc);
    }
    
    private static void subseq(StringBuilder proc, StringBuilder unproc){//processed unprocessed
        if(unproc.length()==0){//base case
        if(proc.length()!=0){
            System.out.println(proc);
        }
            return;
        }
        char ch = unproc.charAt(0);
        
        unproc.delete(0, 1); //index start and final
        //removing item in unprocessed and appending in processed
        proc.append(ch); 
        subseq(proc, unproc);
        unproc.delete(proc.length()-1, proc.length());
        
        subseq(proc, unproc);
        
        unproc.insert(offset:0, ch); //offset ->index
    }
