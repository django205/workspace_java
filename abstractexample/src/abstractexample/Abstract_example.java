package abstractexample;
abstract class A{
	
	int x=10,y=20;
	static int z=30;
	void method1(){
		System.out.println("x   "+x);
		System.out.println("y   "+y);
		System.out.println("z   "+z);
	}
	//final abstract void method2();//abstract method cannot be final,static or private
	//abstract static void method2();
	//private abstract void method2();
	abstract void method2();
	
}

class B extends A{
	int i=40,j=50;
	    void method1(){
		System.out.println("x   "+x);
		System.out.println("y   "+y);
		System.out.println("z   "+z);
		System.out.println("i     "+i );
		System.out.println("j    "+j);
		
	}
		void method2() {
			System.out.println("x     "+x);
		System.out.println("i   "+i);
		System.out.println("j    "+j);
	}
}
public class Abstract_example {

	public static void main(String args[]){
	
		//A obj=new A();// cannot create object of abstract class
		//can create only reference
		
		A obj1=null;
		System.out.println(obj1);
		B obj2=new B();
		System.out.println(obj2);
		obj1=obj2;
		System.out.println(obj1);
		obj1.method1();
		System.out.println("" );
		
		obj1.method2();
		System.out.println("static z value is =  "+A.z);//static member can be call without object
		
	}
}
