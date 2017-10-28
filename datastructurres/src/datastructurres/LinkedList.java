package datastructurres;

public class LinkedList {

	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
		}
	}
	public void printlist(){
		Node n=head;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
	}
	public void delete(int key){
		
	}
	public void push(int newdata){
		Node newNode=new Node(newdata);
		newNode.next=head;
		head=newNode;
	}
	public void insertAfter(Node prevNode,int newdata){
		if(prevNode==null){
			System.out.println("prevoius node can't be nulll");
			return;
		}
		Node newNode=new Node(newdata);
		newNode.next=prevNode.next;
		prevNode.next=newNode;
	}
	public void append(int newdata){
		if(head==null){
			head=new Node(newdata);
			return;
		}
		
		Node n=head;
		while(n.next!=null){
			n=n.next;
		}
		Node newNode=new Node(newdata);
		newNode.next=null;
		n.next=newNode;
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList linklist=new LinkedList();
linklist.head=new Node(1);
Node second=new Node(2);
Node third =new Node(3);
linklist.head.next=second;
	 /*  Now next of first Node refers to second.  So they
    both are linked.

 llist.head        second              third
    |                |                  |
    |                |                  |
+----+------+     +----+------+     +----+------+
| 1  |  o-------->| 2  | null |     |  3 | null |
+----+------+     +----+------+     +----+------+ */
	
	second.next=third;
    /*  Now next of second Node refers to third.  So all three
    nodes are linked.

 llist.head        second              third
    |                |                  |
    |                |                  |
+----+------+     +----+------+     +----+------+
| 1  |  o-------->| 2  |  o-------->|  3 | null |
+----+------+     +----+------+     +----+------+ */
	
	linklist.printlist();
	
	
	linklist.push(605);
	linklist.append(606);
	linklist.insertAfter(linklist.head.next, 210);
	System.out.println("created linkedn list");
	linklist.printlist();
	
	}

}
