package callingmethod;

public class Callbyref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 tt=new Test2(30,40);
		System.out.println(tt.a+"    "+tt.b);
		tt.meth(tt);
		System.out.println(tt.a+"   "+tt.b);

	}

}
