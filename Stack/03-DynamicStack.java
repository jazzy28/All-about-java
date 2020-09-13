//size will not be fixed, like Array
//using inheritance to inherit desired state behavior
//modifying push operation, as it was of fixed size in array

import java.util.*; 

public class CustomStack 
{
	public static void main(String[] args) {
	    
	    protected int[] data; //protected, so that DynamicStack can inherit it
	    protected final int DEFAULT_SIZE = 10;
	    
	    private int top = -1; 
	    
	    public CustomStack(){ 
	        this.data = new int[DEFAULT_SIZE];
	    
	    public CustomStack(int size){
	        this.data = new int(size); 
	    }
	    
	    public void push(int item){

	        if(isFull()){
	            System.out.println("Stack overflow");
	            return;
	        }
	        
	        this.data[++top] = item; 
	    }
	    
	    public Integer pop(){ 
	        if(isEmpty()){
	            System.out.println("Stack underflow");
	            return null; 
	        
	        return this.data[top--] == item;   
	    }
	    
	    public boolean isFull(){
	        return top == this.data.length-1; 
	    }
	    
	     public boolean isEmpty(){
	        return top == -1; 
	    }
    public Integer peek(){
	        if(isEmpty()){
	            System.out.println("Stack is empty");
	            return null;
	    }
	    return this.data[top]; 
	    
	}
}

	//StackClient.java
public class StackClient 
	public static void main(String[] args) {
	    DynamicStack stack = new DynamicStack();
	
        for(int i = 0; i<15; i++){
            stack.push(i);
        }
        
		System.out.println(stack.pop()); 
		
		System.out.println(stack.empty()); 
	}
}

public class DynamicStack extends CustomStack
{
	public static void main(String[] args) {
	    @Override
	    public void push(int item){
	        int[] temp = new int[this.data.length*2]; //temporary array, double the size of array, whenever the array is abt to get full
	        
	        //copying the data from array to larger temporary array
	        for(int i = 0; i < data.length; i++){
	            temp[i] = data[i]; //copying array
	        }
	        this.data = temp; //data is now temp array (double size)
	    }
	    super.push(item); //from CustomStack 
	    //super: goes to member data or member function of parent class
	}
}
