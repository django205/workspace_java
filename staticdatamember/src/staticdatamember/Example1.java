package staticdatamember;

public class Example1 {
	static int a;
	void output(){
		System.out.println(" "+a);
		a++;
	}
	
	static{
		
		System.out.println("this is static block");
	}
	

}
