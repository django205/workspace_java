package hackerEarth;

import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        String []str=new String[n];
	        for(int i=0;i<n;i++){
	        str[i]=sc.next();
	        }
	        
	        int q=sc.nextInt();
	         String []str2=new String[q];
	        for(int i=0;i<q;i++){
	             str2[i]=sc.next();
	        }
	       // System.out.println("n    :"+n+"     c:  "+q);
	        int c=0;
	        for(int i=0;i<q;i++){
	             for(int j=0;j<n;i++){
	         System.out.println(str2[j]+"      "+str[i]);
	            	 
	            	 //if(str2[j].equals(str[i])) c++;
	             }
	            System.out.println(c);
	            c=0;
	        }     
	}

}
