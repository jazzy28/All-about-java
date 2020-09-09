//Palindrome: naman
//first = last char and so on
//trick: half of left side is equal to half of right
//to check each character: either change string to char array OR charAt -> at that particular index check

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = "naman";
        System.out.println(palindrome(str));
    }
    
    private static boolean palindrome(String str){ //true/false
        
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true; //palindrome
    }
}
