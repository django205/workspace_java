package hackerEarth;
import java.util.*;
import java.math.*;

public class BeautifulDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	        int i=sc.nextInt();
	       
	        int j=sc.nextInt();
	       
	        int k=sc.nextInt();
	        
	        int c=0;
	        for(int a=i;a<=j;a++){
	        	// System.out.println(a+"    a      ");
	        	int p;
	        	 int reverse=0;
	        	int temp=a;
	        	while(temp>0){
	        		//System.out.println("hello"+a);
	        		 p=temp%10;
	        		 temp=temp/10;
	        		reverse=reverse*10+p;
	        	}
	        	if(Math.abs(reverse-a)%k==0) c++;
	        }
	        System.out.println(c);
	}

}
