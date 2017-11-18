package datastructurres;

class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
public class TreeTraversal {
	Node root;
	TreeTraversal(){
		root=null;
	}
	
	
	void printpostOrder(Node node){
		if(node==null)return;
		
		printpostOrder(node.left);
		printpostOrder(node.right);
		System.out.print(node.data+"  ");
	}
	void printpreOrder(Node node){
		if(node==null)return;
		
		System.out.print(node.data+"  ");
		printpreOrder(node.left);
		printpreOrder(node.right);
	}
	void printinOrder(Node node){
		if(node==null)return;
		
		printinOrder(node.left);
		System.out.print(node.data+"  ");
		printinOrder(node.right);
	}
	
	 // Wrappers over above recursive functions
    void printPostorder()  {     printpostOrder(root);  }
    void printInorder()    {     printinOrder(root);   }
    void printPreorder()   {     printpreOrder(root);  }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeTraversal tree=new TreeTraversal();
			  	tree.root = new Node(1);
		        tree.root.left = new Node(2);
		        tree.root.right = new Node(3);
		        tree.root.left.left = new Node(4);
		        tree.root.left.right = new Node(5);
		 
		        System.out.println("Preorder traversal of binary tree is ");
		        tree.printPreorder();
		 
		        System.out.println("\nInorder traversal of binary tree is ");
		        tree.printInorder();
		 
		        System.out.println("\nPostorder traversal of binary tree is ");
		        tree.printPostorder();
	}

}
