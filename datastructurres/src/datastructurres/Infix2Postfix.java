package datastructurres;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Infix2Postfix {

		
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
			String infix;
		
			//create an input stream object
		//	BufferedReader keyboard = new BufferedReader (new InputStreamReader(System.in));
			Scanner sc=new Scanner(System.in);
			//get input from user
			System.out.print("\nEnter the algebraic expression in infix: ");
	//		infix = keyboard.readLine();
			infix=sc.nextLine();
			//output as postfix
			System.out.println("The expression in postfix is:" + toPostfix(infix));
			
		}

		private static String toPostfix(String infix)
		//converts an infix expression to postfix
		{
			java.util.Stack<Character> operators = new java.util.Stack<Character>();
			char symbol;
			String postfix = "";
			
	                for(int i=0;i<infix.length();++i){
	                	//while there is input to be read
	                	symbol = infix.charAt(i);
	                		//if it's an operand, add it to the string
	                        if (Character.isLetter(symbol))
	                        	postfix = postfix + symbol;
	                        else if (symbol=='('){
	                        	//push (
								operators.push(symbol);
	                        }
	                        else if (symbol==')'){
				//push everything back to (
	                        	while (operators.peek() != '(')
	                        	{
	                        		postfix = postfix + operators.pop();
	                        	}
	                        	operators.pop();		//remove '('
	                        }
	                        else{
	                        	//print operators occurring before it that have greater precedence
	                                while (!operators.isEmpty() && !(operators.peek()=='(') && prec(symbol) <= prec(operators.peek()))
	                                	postfix = postfix + operators.pop();
					
	                                	operators.push(symbol);
	                        		}
	                	}
			while (!operators.isEmpty())
				postfix = postfix + operators.pop();
				return postfix;
		}
	
		static int prec(char x)
		{
			if (x == '+' || x == '-')
				return 1;
			if (x == '*' || x == '/' || x == '%')
				return 2;
			return 0;
		}


}