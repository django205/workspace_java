package inheritance;

public class Child extends Parent {
	int c;
	Child(){
		System.out.println("child class constructor");
	}
	void childmethod(){
		System.out.println("child class method"+a+"  "+c);
	}
	Child(int i,int j){
		super(i);//it is used to call base class constructor
		c=j;
	}

}
