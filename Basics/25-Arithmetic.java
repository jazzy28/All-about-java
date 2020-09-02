import java.util.*;

public class Main{
public static void main(String[] args){

int b = 45;

int c = b++; //b++ increments itself in the next line
c = ++b; // output will be 46, 46 as changes will be made in the same line itself

System.out.println(c + " " + b); //c=45, b=46

}
}
