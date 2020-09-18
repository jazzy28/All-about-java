import java.util.*;

public class CustomQueue
{
	public static void main(String[] args) {
	    protected int[] data;
	    protected int end; //to insert elements
	    private final int DEFAULT_SIZE = 10;
	    
	    //constructor
	    CustomQueue(){//non-parameterized
	        data = new int[DEFAULT_SIZE];
	        end = -1;
	    }
	    
	    CustomQueue(int size){ //custom array
	        data = new int(size);
	        end = -1;
	    }
	    
	    public boolean isFull(){
	        return end == this.data.length-1;
	    }
	    
	    public boolean isEmpty(){
	        return end == -1;
	    }
	    
	    public void add(int item){ //adding at the end
	    if(isFull()){
	    System.out.println("Queue is full");
	    return;
	    }
	    this.data[++end] = item; //pre-increment: increment end by 1, then assign that item
	        
	    }
	    
	    public Integer remove(){ //returning an element
	        if(isEmpty()){
	           System.out.println("Queue is empty");
	           return null; //empty
	        }
	        //whatever you are returning, save it in temporary
	        int temp = this.data[0];
	        
	        //shifting every element ahead by 1
	        for(int i = 0; i < end; i++){
	            this.data[i] = this.data[i+1];
	        }
	        return temp;
	    }
	    
	}
}
