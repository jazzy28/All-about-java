//Queues: FIFO(first in, first out)
//Queue is an interface and not a class, we cannot make objects of interface, but we can make reference
//methods in interface are abstract, no implementation
//Interfaces are implemented by classes

import java.util.*;

public class QueueClient
{
	public static void main(String[] args) {
	    Queue<Integer> queue = new LinkedList<>(); //LinkedList class implementes Queue interface
	    queue.add(1);
	    queue.add(2);
	    queue.add(3);
	    queue.add(4);
	    
	    //an element is returned when removed
	    System.out.println(queue.remove());//1
	    System.out.println(queue.remove());//2
	    
		
	}
}
