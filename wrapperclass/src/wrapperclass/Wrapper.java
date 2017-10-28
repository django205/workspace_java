package wrapperclass;

public class Wrapper {
	public static void main(String args[]){
		int a=10;
		Integer ii=new Integer(a);//boxing
		System.out.println(ii);
		int b;
		b=ii.intValue();//unboxing
		System.out.println(b);
		b=ii.parseInt("605");//string to int
		System.out.println(b);
		
		Integer aa=20;//auto boxing
	System.out.println(aa);
	int c=30;
	c=aa+20;//auto unboxing
	System.out.println(c);
	
	Integer cc=Integer.valueOf(111);
	System.out.println(cc);
		
	}

}
