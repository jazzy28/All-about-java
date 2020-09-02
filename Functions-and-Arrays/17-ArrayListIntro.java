import java.util.*;
//java.util.Scanner;
//java.util.ArrayList;
//java.util.Collections


//Better than array, doesn't take a lot of memory.
//have methods to add and remove elements
//ArrayList 2x or 1.5x the size once it gets the size
//example size = 5, it will make it as 10
public class Main{

  public static void main(String []args){
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < 10; i++){
        list.add(i); //add till 4 elements
    }
    System.out.println(list);
    
  }
}
   
