package collection;

import java.util.Vector;

public class Vectorexample {

	
	public static void main(String[] args){
	 
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(12);
		v.add(34);
		v.add(10);
		v.add(34);
		v.add(12);
		v.add(12);
		v.add(10);
		v.add(34);
		v.add(10);
		v.add(12);
		v.add(34);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
	}
}
