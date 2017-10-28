package hackerEarth;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	   int temp,flag;
	   for(int i=2;i<=N;i++){
		   temp=i/2;
		   flag=0;
		   for(int j=2;j<=temp;j++){
			   if(i%j==0) flag++;
		   }
		   if(flag==0) System.out.println(i);
	   }
	}

}
