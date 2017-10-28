 package accessmodifier;

public class Accessmodifier {

	public static void main(String[] args) {
		Example e=new Example();
		e.defaultmethod();
		//e.privatemethod();   //private is not accessible
		e.publicmethod();
		e.protectedmethod();
		e.generalmethod();
		System.out.println(e.a);
		//System.out.println(e.b);
		System.out.println(e.c);
		System.out.println(e.d);

	}

}
