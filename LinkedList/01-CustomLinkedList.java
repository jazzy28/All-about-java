//CustomLinkedList.java

public class CustomLinkedList
{
    Node head, tail; //start and end point
    int size = 0; //size of linkedlist
    
	class Node{
	    int value; //value of itself
	    Node next; //Human will have a relationship with human only
	    Node(int value){ //constructor
	        this.value = value; //self love
	    }
	    
	    Node(int value, next){//self love + to whom he/she loves
	        this.value = value;
	        this.next = next;
	    }
	}
	
	//inserting at the start
	public void insertAtFirst(int val){
	    Node node = new Node(val, head); //loving itself and head vale
	    head = node; //new node will become head
	    if(size == 0){ //empty linkedlist
	        tail = node;
	    }
	    size++;
	}
	
	//insert at the last
	public void insertAtLast(int val){
	    if(size == 0){
	        insertAtFirst(val);
	        return;
	    }
	    Node node = new Node(val); //automatically will point to null
	    tail.next = node;
	    tail = node; //tail points to the new node
	    size++;
	}

}

//LinkedListClient.java
public class LinkedListClient{
	public static void main(String[] args) {

		System.out.println("Hello World");
	}
}

