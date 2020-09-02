import java.util.*;
//Binary search: better than linear search, ONLY IF ITS SORTED!!!

public class Main{

  public static void main(String []args){
     
        int[] nums = {1, 2, 4, 6, 8, 12};
        
        //System.out.println(Arrays.toString(nums));
        int elt = 8; //element to find
        int ind = binarySearch(nums, elt);
        System.out.println(ind);
     }
     public static int binarySearch(int[] nums, int elt){ 
        int start = 0, end = nums.length - 1; //taking index of element, nums.length-1 is actual last element
        while(start <= end){
          int mid = (start + end) / 2;
          if(nums[mid] == elt){
            return mid;
          } else if(nums[mid] < elt){
            start = mid + 1;
          } else{
           end = mid - 1;
          }
        }
        return -1;
      }
    }
   
