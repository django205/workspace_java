package hello;

import java.util.Scanner;

public class Hello {
	
	int rollno;
	String s="Go to Hell";
	void output(){
		System.out.println(s);
		System.out.println(s+"   "+rollno);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello world");
        System.out.println("fuck off");
        Scanner cin=new Scanner(System.in);
        String ss;
        ss=cin.nextLine();
        System.out.println(ss);
        Hello h1=new Hello();
        h1.rollno=1;
		h1.s="Welcome to the World";
        h1.output();
        	
        
		}
	}