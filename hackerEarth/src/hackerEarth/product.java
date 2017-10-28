package hackerEarth;

import java.util.Scanner;

public class product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        int j=1;
	         int m=1000000007;
	        int a[]=new int[1010];
	        for(int i=0;i<N;i++) a[i]=s.nextInt(); 
	       
	        for(int i=0;i<N;i++){
	            j=(j*(a[i]))%m;
	        }
	        System.out.println(j);
	}

}
