package hackerEarth;
import java.util.*;
public class FootballFest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
	        int N = s.nextInt();

	for(int i=0;i<N;i++){
	Stack stack=new Stack();
	       int q=s.nextInt();
	      
	        int id=s.nextInt();
	        stack.push(id);
	        int c=0;
	        for(int j=0;j<q;j++){
	        	String str=s.next();
	        	if(str.charAt(0)=='P'){
	        		stack.push(s.nextInt());
	        	c=0;
	        	}
	        	else {
	        		if(c>0){}
	        		else stack.pop();
	        	c++;
	        	}
	        }
	    System.out.println("Player "+stack.peek());
	}
	}

}
