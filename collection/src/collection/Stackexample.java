package collection;

import java.util.Stack;

public class Stackexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(12);
		s.push(30);
		s.push(23);
		s.push(45);
		int x=(Integer)s.pop();
		System.out.println(x);
		System.out.println(s);
		x=(Integer)s.peek();
		System.out.println(x);
		int y=s.search(10);
		System.out.println(y);
		
		
	}

}
