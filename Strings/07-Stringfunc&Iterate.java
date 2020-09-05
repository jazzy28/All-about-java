import java.util.*;
public class Main{

     public static void main(String []args){
       
        
        //split, and form array
        String names = "Jasmine, Khushboo, Rekha, Mahesh";
        String[] namesArr = names.split(",");//returns array of strings
        System.out.println(Arrays.toString(namesArr));
        
        String temp = "Hello World.";
        System.out.println(temp.startsWith("Hello"));
        System.out.println(temp.endsWith("."));//True
        
        System.out.println(temp.indexOf('W'));
        
        //for loop for strings
        String sentence = "Hey, I am having fun.";
        
        //iterate over the string
        // for(int i = 0; i<sentence.length(); i++){
        //     System.out.println(sentence.charAt(i));
        // }
        
        //cleaner way to iterate over the string
        //for each loop, used in arrays
        for(char ch: sentence.toCharArray()){
            System.out.println(ch);
        }
    
      
     }
}
