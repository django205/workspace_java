package hackerEarth;

import java.util.Scanner;

public class Array2D {

	public static int hourglass(int i, int j,int [][]arr) {
		// TODO Auto-generated method stub
		int sum=0;
	

		sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);  
		int arr[][] = new int[6][6];
		int r[]=new int[16];
	        for(int arr_i=0; arr_i < 6; arr_i++){
	            for(int arr_j=0; arr_j < 6; arr_j++){
	                arr[arr_i][arr_j] = in.nextInt();
	            }
	        }
	        int m=0;
	        for(int i=0;i<4;i++){
	        	for(int j=0;j<4;j++){
	        	r[m]=hourglass(i,j,arr);
	        	m++;
	        	
	        	}
	        }
	        int max=r[0];
	 for(int i=0;i<16;i++){
		  
		 if(max<r[i]) max=r[i];
	 }
	 
	        System.out.println(max);
	}


}
