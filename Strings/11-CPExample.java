import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine()); //no. of test cases, takes i/p as a string; to avoid empty line issues

        while(t-->0){//jitne test cases, utni lines i/p
        String str = s.nextLine();
        System.out.println(str);
        }
    }
}
