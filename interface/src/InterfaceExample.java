



interface interface1{
		
		int y=20,x=10;
		void method1();
		void method2();
		/* void method3();*/
	}


public class InterfaceExample implements interface1 {

	//interface is pure abstract class 
	//interface data members are public ,static and final by default
	//implements is used to inherit interfaces
	

	@Override
	public void method1() {
		System.out.println("inside method1()");
	
		
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("inside method2()");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	interface1 obj1=new interface1();//interfaces cannot be instantiated
		interface1 obj1;
		InterfaceExample obj2=new InterfaceExample();
		obj2.method1();
		obj2.method2();
		obj1=obj2;
		obj1.method1();
		obj1.method2();
		
	}


	

}
