package hackerEarth;

import java.util.Scanner;

public class Chocolate {
    static int solve(int n, int[] s, int d, int m){
        // Complete this function
   int sum=0,c=0;
        for(int i=0;i<s.length;i++){
         for(int j=i;j<m;j++){
             sum=sum+s[j];
           
         }
         System.out.println("sum   :"+sum+"     i:"+i+"    m:"+m);
         if(sum==d){ c++;   
          }
         sum=0; 
            if(m<n) m++;
    }
return c;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] s = new int[n];
	        for(int i=0; i < n; i++){
	            s[i] = in.nextInt();
	        }
	        int d = in.nextInt();
	        int m = in.nextInt();
	        int result = solve(n, s, d, m);
	        System.out.println(result);
	}

}
