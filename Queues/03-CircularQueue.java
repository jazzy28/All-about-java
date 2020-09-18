import java.util.*;

//CircularQueue.java
public class CircularQueue
{
	public static void main(String[] args) {
	   int[] data;
	   int front, end;
	   int size;
	   private final int DEFAULT_SIZE = 1O; //final, so that value can't be changed further
	   
	   CircularQueue(){
	       data = new int[DEFAULT_SIZE];
	       front = 0;
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
	       //storing before the front gets removed
	       int temp = data[front];
	       this.front = (front+1)% data.length;
	       size--;
	       return temp;
	   }
	    
	}
}

//QueueClient.java
public class QueueClient
{
	public static void main(String[] args) {
	    CircularQueue queue = new CircularQueue(); //LinkedList class implementes Queue interface
	    queue.add(1);
	    queue.add(2);
	    queue.add(3);
	    queue.add(4);
	    
	    //an element is returned when removed
	    System.out.println(queue.remove());//1
	    
		
	}
}

