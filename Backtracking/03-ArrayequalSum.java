//StringBuilder : object can be edited, whereas, we cannot edit String
import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] nums = {1, 2, 3}; //Array
        
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        
        eqSum(first, second, 0, 0, nums, 0);
        
    }
    public static void eqSum(ArrayList<Integer> first, ArrayList<Integer> second, int fsum, int ssum, int[] nums, int index){
        if(index == nums.length){ //base case
            if(fsum == ssum){
                System.out.println(first + " : " + second);
            }
            
            return;
        }
        
        int item = nums[index];//item to be added
        
        first.add(item);
        eqSum(first, second, fsum + item, ssum, nums, index + 1);
        first.remove(first.size()-1);//backtrack, as its a list, .size instead of .length
        
        second.add(item);
        eqSum(first, second, fsum, ssum + item, nums, index + 1);
        second.remove(second.size()-1);
    }
}
