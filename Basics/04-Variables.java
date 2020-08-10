import java.util.*;

public class Variables{
public static void main(String[] args) {
		int x = 15;
		int y = 10;
		int sum = x + y;
		System.out.println("Sum of " + x + " and " + y + " is " + sum);

		//xy = product
		int prd = x * y;
		System.out.println("Product of " + x + " and " + y + " is " + prd);

		//divide: x/y, y/x . x%y
		int v1 = x / y;
		int v2 = y / x;
		int v3 = x % y;

		System.out.println(v1); // 1: quotient
		System.out.println(v2); // 0: quotient
		System.out.println(v3); // 5: remainder

		//Rules of BODMAS(there is nothing like bodmas :))
		//Here we have priorities

		// () have greater priority than *, /, % have greater priority than +, -
		//From  LHS the execution will start if the operator have same priority

		int exp = x * y / x + y;
		System.out.println(exp); //20
		int exp1 = (x * y) / (x + y);
		System.out.println(exp)1;//6

		System.out.println(Math.pow(2, 3));//8.0 :float

		int exp2 = (int)Math.pow(2, 3);
        System.out.println(exp2); //8 : integer

	}
}
//  There is no operator for exponentiation. 2 ^ 3 is not 8. This is XOR operator. We'll do it later. 
//  To do exponentiation use Math.pow function. 