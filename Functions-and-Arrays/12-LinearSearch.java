  
import java.util.*;

public class Main{

  public static void main(String []args){
     
        int[] nums = {1, 6, 2, 9, 4, 2};
        
        System.out.println(Arrays.toString(nums));
        int elt = 6; //element to find
        int ind = linearSearch(nums, elt);// storing the index if element is found
        System.out.println(ind);
     }
     public static int linearSearch(int[] nums, int elt){ //function
        for(int i = 0; i < nums.length; i++){ //without passing length of array
            if(nums[i] == elt){
                return i; //returning index
            }
        }
        return -1; //invalid index
     }
}
