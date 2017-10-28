package inheritance;

public class Parent {
	
	int a;
	Parent(){
		System.out.println("parent class constructor");
	}
	public Parent(int i) {
		a=i;
	}
	void parentmethod(){
		System.out.println("parent class method");
	}

}
