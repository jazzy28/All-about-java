//CustomLinkedList.java

//without tail, insertion at end would have time complexity: O(n)
//now complexity is O(1) to add at the end

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
	
	//delete at the start
	public Integer deleteAtFirst(){
	    if(size == 0){//no elements present
	        return null;
	    }
	    int temp = head.value; //store the value to be deleted
	    head = head.next;
	    size--; 
	    if(size == 0){
	        tail = null;
	    }
	    return temp;
	}
	
	//delete at the end
	public Integer deleteAtLast(){
	    if(size <= 1){
	        return deleteAtFirst();
	    }
	    Node node = head;
	    while(node.next != tail){ //one node before tail
	        node = node.next;
	    }
	    int temp = tail.value;
	    tail = node;
	    tail.next = null; //assign null val;
	    size--;
	    return temp;
	}
	
	//to display the LinkedList
	public void display(){
	    Node temp = head;//temporary Node
	    while(temp != null){
	        System.out.print(temp.value + " ");
	        temp = temp.next;
	    }
	    System.out.println();
	}

}

//LinkedListClient.java
public class LinkedListClient{
	public static void main(String[] args) {
	    CustomLinkedList list = new CustomLinkedList();
	    list.insertAtFirst(2);
	    list.insertAtFirst(5); //5 2
		list.display(); 
		list.insertAtLast(3);
		list.insertAtLast(8); //3 8
		list.display(); //5 2 3 8
		list.deleteAtLast();
		list.display(); //5 2 3
	}
}

//o/p: 5 2 3 
