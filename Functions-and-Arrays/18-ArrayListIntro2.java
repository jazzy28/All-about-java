//As array list plays with objects internally. Therefore, it does't matter if the elements are heterogeneous, until not mentioned whille creating it.
import java.util.*;

public class Main{

  public static void main(String []args){
    ArrayList list = new ArrayList<>();
    list.add(1);
    list.add("hey");
    list.add('c');
    System.out.println(list);
    
  }
}
  
