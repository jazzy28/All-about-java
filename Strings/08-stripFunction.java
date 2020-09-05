public class Main 
{
    public static void main(String[] args) 
    {
        String str = "  Hello World !!   ";
 
        System.out.println( str.strip() );          //"Hello World !!"
 
        System.out.println( str.stripLeading() );   //"Hello World !!   "
 
        System.out.println( str.stripTrailing() );  //"  Hello World !!"
        
 
        System.out.println(str.toUpperCase()); 
        System.out.println(str.toLowerCase()); 
        System.out.println(str.toLowerCase());
        System.out.println(str.replace('a', 'e')); //as strings are immutable it cannot be changed
       str = str.replace('e', 'a');
       System.out.println(str);
    }
}
