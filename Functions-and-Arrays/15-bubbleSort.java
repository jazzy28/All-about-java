import java.util.*;

public class Main{

  public static void main(String []args){
    int[] nums = {1, 5, 2, 9, 43, 26};
    System.out.println(Arrays.toString(nums)); //before
    bubbleSort(nums);
    System.out.println(Arrays.toString(nums)); //after
  }
  public static void bubbleSort(int[] nums){
      for(int i = 0; i < nums.length; i++){ //traversing whole array and helping j
          for(int j = 0; j < nums.length - 1 - i; j++){ //reducing the array traversal by 1
          if(nums[j] > nums[j+1]){
              swap(nums, j, j+1);
          }

          }
      }
  }
  public static void swap(int[] nums, int i, int j){
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
  }
}
