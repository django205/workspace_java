package hashcodes;

public class Hashcodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A aa=new A();
		B bb=new B();
		C cc=new C();
		System.out.println("object reference code");
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		
		System.out.println("object hashcodes");
		System.out.println(aa.hashCode());
		System.out.println(bb.hashCode());
		System.out.println(cc.hashCode());
		
	}

}
