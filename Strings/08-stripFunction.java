public class Main 
{
    public static void main(String[] args) 
    {
        String str = "  Hello World !!   ";
 
        System.out.println( str.strip() );          //"Hello World !!"
 
        System.out.println( str.stripLeading() );   //"Hello World !!   "
 
        System.out.println( str.stripTrailing() );  //"  Hello World !!"
    }
}
