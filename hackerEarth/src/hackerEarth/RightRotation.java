package hackerEarth;

import java.util.Scanner;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int q = in.nextInt();
	        int[] a = new int[n];
	        int []arr=new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        for(int i=0;i<n;i++){
	        	arr[i]=a[(i-k+n)%n];
	        	//System.out.println(" array  "+a[i]);
	        }
	        
	        for(int a0 = 0; a0 < q; a0++){
	       
	            int m = in.nextInt();
	            //System.out.println("m    :"+m);
	            System.out.println(arr[m]);  
	          
	        }
	    
	}

}
