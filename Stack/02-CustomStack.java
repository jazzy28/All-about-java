//Stack: Abstract data type (ADT), we know the working but not internal implementation
//stack can be created with help of array, linkedlist, array list, queues

//STACK USING ARRAY

//CustomStack.java
import java.util.*; 

public class CustomStack 
{
	public static void main(String[] args) {
	    
	    //Creating stack with help of Array
	    private int[] data; //array declaration
	    private final int DEFAULT_SIZE = 10; //Size of array is 10
	    
	    //pointer to point the position remove/add element
	    private int top = -1; 
	    
	    //constructor
	    public CustomStack(){ //if size is not provided
	        this.data = new int[DEFAULT_SIZE]; //array initialization
	    }
	    
	    public CustomStack(int size){
	        this.data = new int(size); //if size is provided
	    }
	    
	    //to insert element
	    public void push(int item){
	        //to check if array is full or not
	        if(isFull()){
	            System.out.println("Stack overflow");
	            return;
	        }
	        
	        this.data[++top] = item; //before insertion, value of top will be increased
	    }
	    
	    //to remove element
	    public Integer pop(){ //returning the element
	        if(isEmpty()){
	            System.out.println("Stack underflow");
	            return null; //don't write return -1, as there can be negative numbers too, so instead of int, make the return type as Integer
	        }
	        
	        return this.data[top--] == item; //post decrement, first return the top most element, then decrease the value of top by 1
	    }
	    
	    public boolean isFull(){
	        return top == this.data.length-1; //pointing at the last element, return true/false
	    }
	    
	     public boolean isEmpty(){
	        return top == -1; //top = -1, when stack is empty
	    }
    //to display the top most element
    public Integer peek(){
	        if(isEmpty()){
	            System.out.println("Stack is empty");
	            return null;
	    }
	    return this.data[top];
	    
	}
}

	//StackClient.java
public class StackClient //don't name Stack as the class name, already exists
{
	public static void main(String[] args) {
	    CustomStack stack = new CustomStack();
	
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

