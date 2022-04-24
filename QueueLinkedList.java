package queueLinkedlist;

public class QueueLinkedList<DataType> implements Queue<DataType> {
	int size;
	class Node{
		int data;
		Node next;	

	}
	Node top;
	QueueLinkedList(){
		top=null;
		size=0;
	}
	public void Push(DataType value) {
		Node new_node=new Node();
		new_node.data=(int)value;
		new_node.next=null;
		if(top==null) {
			top=new_node;
			size++;
		}else {
			Node temp_node=new Node();
		temp_node=top;
		while(temp_node.next!=null) {
			temp_node=temp_node.next;
		}
	     temp_node.next=new_node;
	     size++;
		}	
	}
	public int peek() {
		if(top!=null) {
			return  top.data;
		}
		else
		System.out.println("stack is empty");
		return -1;
	}

	
	public int pop() {
		int  b = 0;
	Node current_node=new Node();
	current_node=top;
	for( int i=0;i<=size-2;i++) {
	current_node=current_node.next;	
	}
	b=current_node.data;
	 current_node=null;
	 size--;
	 return b;
	}
	public void traverse() {
		  Node temp = top; 
	       for(int b=0;b<size;b++) { 
	        	System.out.println(temp.data+" "); 
	            temp = temp.next; 	
	}

}
}