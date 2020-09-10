//Recursion: divide the problem into sub problems but where you are able to reach the base case

import java.util.*;
public class Main{
    public static void main(String[] args){
        int n = 5;
        print(5);
    }
    public static void print(int n){ //returning nothing, so void
        if(n == 0){//stops, when reaches 0
            return;
        }
        System.out.println(n);
        print(n-1);//recursive call
    }
}
