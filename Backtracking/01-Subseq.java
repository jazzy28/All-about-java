import java.util.*;
public class Main{
    public static void main(String[] args){
        subseq(proc:"", unproc:"abc");
    }
    private static void subseq(String proc, String unproc){//processed unprocessed
        if(unproc.isEmpty()){//base case
        if(proc.isEmpty()){
            System.out.println(proc);
        }
            return;
        }
        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);
        
        subseq(proc: proc + ch, unproc);
        subseq(proc, unproc);
    }
}
