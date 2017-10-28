package overrriding;

public class Child extends Parent{

	void childmethod(){
		System.out.println("child method");
	}
	void parentmethod(){     //overriding method
		super.parentmethod();
		System.out.println("parent child method");

		
	}
}
