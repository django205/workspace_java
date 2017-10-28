package hackerEarth;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class socksMerchant {
    static int sockMerchant(int n, int[] ar) {
        // Complete this function
     int c=0;
    	Arrays.sort(ar);
     for(int i=0;i<n-1;i++){
    	 if(ar[i]==ar[i+1]) {
    		 c++;
    		 i++;
    	 }
     }
     return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = sockMerchant(n, ar);
	        System.out.println(result);
	}

}
