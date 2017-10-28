package accessmodifier;

public class Example {

	int a;
	private int b;
	public int c;
	protected int d;
	Example(){
		a=1;
		b=2;
		c=3;
		d=4;
		
	}
	void defaultmethod(){
		System.out.println("Default method");
	}
	private void privatemethod(){
		System.out.println("private method");
	}
	public void publicmethod(){
		System.out.println("public method");
	}
	protected void protectedmethod(){
		System.out.println("protected method");
	}
	
	void generalmethod(){
		System.out.println("general method");
		defaultmethod();
		privatemethod();
		publicmethod();
		protectedmethod();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
