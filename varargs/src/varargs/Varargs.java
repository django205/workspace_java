package varargs;

public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method(10,"django");
		//method(10);
		//method(10,"yogesh","kumar","maurya");
		
		
	}

	//public static void method(int x,String [] p)
	public static void method(int x,String...p)
	{
		System.out.println("x value =  "+x);
		for(int i=0;i<p.length;i++){
			System.out.println("String is = "+p[i]);
		}
	}
}
