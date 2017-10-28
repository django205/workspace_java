package hackerEarth;

import java.util.Scanner;

public class palindrome {
	 public static void main(String args[] ) throws Exception {
	       
	        int c=0;
	        Scanner s = new Scanner(System.in);
	        char [] str = s.next().toCharArray();
	        for(int i=0;i<str.length/2;i++){
	        	if(str[i]==str[str.length-i-1]){ 
	        		c++;
	        	}
     	
                System.out.println(c);
	        }
	                if(c>=((str.length/2)))System.out.println("YES");
	            else System.out.println("NO");
}
}