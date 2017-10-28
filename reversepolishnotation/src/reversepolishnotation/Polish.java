package reversepolishnotation;

import java.util.Scanner;
import java.util.Stack;

public class Polish {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String exp;
		Stack stack = new Stack();
		
		
			String rnp="";
			exp = sc.next();
			char ch;
			for(int j=0; j<exp.length(); j++){
				
				ch = exp.charAt(j);
				
				switch(ch){
					
					case '(': break;
					
					case '+': stack.push(ch);
								break;
								
					case '-': stack.push(ch);
								break;
								
					case '/': stack.push(ch);
								break;
								
					case '*': stack.push(ch);
								break;
								
					case '^': stack.push(ch);
								break;
								
					case ')': rnp += stack.pop();
								break;
					
					default: rnp +=ch;
				}
			}
			System.out.println(rnp);
			
		
		sc.close();
		System.exit(0);
		}

}
