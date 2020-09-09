//To print all the substrings:should be continuous 
//hello: hell -> substring; chota part of whole string
//hello: hll ->subsequence

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = "hello";
        substrings(str);
    }
    
    private static void substrings(String str){//definition of method
        for(int i=0; i<str.length(); i++){//starting index
            for(int j=i+1; j<str.length()+1; j++){//ending index, atleast of size 1
                System.out.println(str.substring(i,j));
            }
        }
    }
}
