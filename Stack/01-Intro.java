//STACK - LIFO (last in first out), stack of plates
//operations: push(insert element), pop(delete element), peek(display top-most element)

public class StackClient //don't name Stack as the class name, already exists
{
	public static void main(String[] args) {
	    Stack<Integer> stack = new Stack(); //stack of integer type
	    
	    //add elements
        stack.push(2);
        stack.push(4);
        stack.push(19);
        stack.push(6);
        
        //to remove top-most element
		System.out.println(stack.pop()); //6 will get removed first
		
		System.out.println(stack.empty()); //false
	}
}
