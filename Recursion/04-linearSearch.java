import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] nums = {2, 9, 3, 4, 2, 0, 1};
        System.out.println(find(nums, 3, 0));//element to find, index
    }
    public static boolean find(int[] nums, int elt, int ind){ 
            if(ind == nums.length){
                return false;
            }
            if(nums[ind] == elt){
                return true;
            }
            return find(nums, elt, ind+1);
    }
}
