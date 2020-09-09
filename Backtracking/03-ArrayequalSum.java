import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] nums = {1, 2, 3};
        
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        
        eqSum(first, second, fsum:0, ssum:0, nums, index:0)
    }
    
    private static void eqSum(ArrayList<Integer> first, ArrayList<Integer> second, int fsum, int ssum, int[] nums, int index){
        if(index == nums.length){
            if(fsum == ssum){
                System.out.println(first + " : " + second); //base case
            }
            return;
        }
        int item = nums[index];
        
        first.add(item);
        eqSum(first, second, fsum: fsum+item, ssum, nums, index:index+1);
        first.remove(first.size()-1);
        
        second.add(item);
        eqSum(first, second, fsum, ssum: ssum+item, nums, index:index+1);
        second.remove(first.size()-1);
    }
}
