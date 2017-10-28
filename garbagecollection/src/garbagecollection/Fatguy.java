package garbagecollection;

public class Fatguy {
	Fatguy(){
		long l[]=new long[10000];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime r=Runtime.getRuntime();
		System.out.println(r.freeMemory());
		Fatguy f1=new Fatguy();
		Fatguy f2=new Fatguy();
		Fatguy f3=new Fatguy();
		Fatguy f4=new Fatguy();
		Fatguy f5=new Fatguy();
		System.out.println(r.freeMemory());

		f1=null;
		f2=null;
		f3=null;
		f4=null;
		f5=null;
		//System.out.println(r.freeMemory());
		r.gc();
	
		System.out.println(r.freeMemory());
	
		
	}
	protected void finalize(){
		System.out.println("now in finalize method");
	}

}
