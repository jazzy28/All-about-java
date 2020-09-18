import java.util.*;

//CustomQueue.java
public class CircularQueue
{
	public static void main(String[] args) {
	   int[] data;
	   int front, end;
	   int size;
	   private final int DEFAULT_SIZE = 1O; //final, so that value can't be changed further
	   
	   CircularQueue(){
	       data = new int[DEFAULT_SIZE];
	       front = -1;
	       end = -1;
	       size = 0; //new queue
	   }
	   
	   CircularQueue(int initialSize){
	       data = new int[initialSize];
	       front = -1;
	       end = -1;
	       size = 0;
	   }
	   
	   public boolean isFull(){
	       return size == data.length;
	   }
	   
	   public boolean isEmpty(){
	       return size == 0;
	   }
	   
	   public void add(int item){
	       if(isFull()){
	           System.out.println("Queue is full");
	           return;
	       }
	       
	       //updating the end first
	       this.end = (end + 1) % data.length;
	       this.data[end] = item;
	       size++; //one element has been added
	   }
	   
	   public Integer remove(){
	       if(isEmpty()){
	           System.out.println("Queue is empty");
	           return null;
	       }
	       //storing before the front gets changed
	       int temp = data[front];
	       this.front = (front + 1)% data.length;
	       size--;
	       return temp;
	   }
	    
	}
}
