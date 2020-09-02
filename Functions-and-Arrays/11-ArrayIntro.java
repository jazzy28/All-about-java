import java.util.*;
//java.Scanner;
//java.Arrays;

public class ArrayIntro{
//array starts from 0th index
     public static void main(String []args){
     
        Scanner scn = new Scanner(System.in);
        int[] nums = new int[5]; //square brackets -> array
        //new because, arrays are treated as objects, therefore, may not be a contiguous memory allocation
        for(int i = 0; i < nums.length; i++){
          nums[i] = scn.nextInt();
        }
        System.out.println(nums);//unique hashcode where array is stored as an object
        System.out.println(Arrays.toString(nums));
     }
}
