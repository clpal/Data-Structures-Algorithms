package linkedList;

public class ReverseLinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node( int d){
			data=d;
			next=null;
		}
	}

	public void push(int new_data){
		Node new_node=new Node(new_data);
		
		new_node.next=head;
	head=	new_node;
		
		
		
	}
	public void insertAfter(Node prev_node,int new_data){
		 if (prev_node == null) 
		    { 
		        System.out.println("The given previous node cannot be null"); 
		        return; 
		    }
		Node new_node=new  Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=	new_node;
	}
	public void printlist(){
		while(head!=null){
			
			System.out.print(head.data + " ");
			head=head.next;
			
		}
	}
	public static void main(String[] args) {
		ReverseLinkedList list=new ReverseLinkedList();
		// TODO Auto-generated method stub
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.insertAfter(list.head.next, 8); 
		System.out.println("Created List: ");
		list.printlist();
	}

}
