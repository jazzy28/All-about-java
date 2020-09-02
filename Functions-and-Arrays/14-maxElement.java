import java.util.*;

public class Main{

  public static void main(String []args){
     
        int[] nums = {1, 2, 4, 6, 8, 12};
        
        System.out.println(maxElement(nums));
     }
     public static int maxElement(int[] nums){ 
        int maxInd = 0; //0th index
        for(int i = 1; i < nums.length; i++){
            if(nums[maxInd] < nums[i]){
                maxInd = i;//updating the max index
            }
        }
        return maxInd; //replaced max index, will return the index of max element
      }
    }
   
