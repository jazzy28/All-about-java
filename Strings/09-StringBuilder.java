import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        // String num = "";//empty array
        // for(int i = 0; i<100; i++){
        //     num = num + i + "-"; //bad thing for memory, as object will be created 100 times, rather than editing in the original array
        // }
        // System.out.println(num);
        
        //STRINGBUILDER CLASS COMES INTO PLAY: can manage threads, thus, better than string buffer class: faster
        //String is immutable, so string builder
        //String Builder: mutable sequence of characters
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 100; i++){
            builder.append(i); //change will happen in the original object
        }
        System.out.println(builder); //saves memory
        System.out.println(builder.toString()); //toString: value of builder
       //toString is an option, just "builder"is fine too.
    }
}
