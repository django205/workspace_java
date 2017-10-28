package callingmethod;

public class CallByValue {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
		int a=50,b=20;
		System.out.println(a+"   "+b);

		t.meth(a,b);
		
		System.out.println(a+"   "+b);//doesn't change value of a nd b
	

}}
