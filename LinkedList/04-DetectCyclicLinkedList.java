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
	
	//return the value of mid element 
	public int mid(){
	    Node slow = head, fast = head;
	    while(slow != null && fast != null && fast.next != null){//to get saved from null pointer exception
	        slow = slow.next; //one element at a time -traversal
	        fast = fast.next.next; //two elements at a time -traversal
	    }
	    int temp = slow.value;
	    return temp;
	}
	//Cyclic LinkedList - main code
	public boolean cycleDetection(){
	    if(size < 3){ //if size of list < 3, cycle bann hi nhi sakti
	        return false;
	    }
	    Node slow = head; fast = head.next.next;//we can't assign head to both, otherwise, the condition will become true in the starting only. Hence, it will return true(cycle)
	    while(slow != null && fast != null && fast.next != null){
	        if(slow == fast){ //these objects will do a reference comparison
	            return true; //cycle detected
	        }
	        slow = slow.next; //incrementing
	        fast = fast.next.next;
	    }
	    return false; //no cycle
	}
	
	//to display the LinkedList
	public void display(){
	    Node temp = head;//temporary Node
	    while(temp != null){
	        System.out.print(temp.value + " ");
	        temp = temp.next;
	    }
	    System.out.println();
	    //checking for a cycle
	    //insertAtLast(4);
	    //tail.next = head;
	}

}

//LinkedListClient.java
public class LinkedListClient{
	public static void main(String[] args) {
	    CustomLinkedList list = new CustomLinkedList();
	    list.insertAtFirst(2);
	    list.insertAtFirst(5); //5 2
		//list.display(); 
		list.insertAtLast(3);
		list.insertAtLast(8); //3 8
		//list.display(); //5 2 3 8
		list.deleteAtLast();
		//System.out.println("Mid: " + list.mid());
		list.display(); //5 2 3
		System.out.println(list.cycleDetection());
	}
}
