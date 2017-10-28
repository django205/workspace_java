package hackerEarth;
import java.util.*;
public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
		        int m = in.nextInt();
		         long arr[]=new long[n];
		         for(int i=0;i<n;i++){
		        	 arr[i]=0;
		         }
		        for(int a0 = 0; a0 < m; a0++){
		            int a = in.nextInt();
		            int b = in.nextInt();
		            int k = in.nextInt();
		       arr[a-1]+=k;						//difference array
	                if(b<n) arr[b]=arr[b]-k;
		     
		        }
		        in.close();
		        
		        long max=0;
	        long temp=0;
		       for(int i=0;i<n;i++){
		          temp+=arr[i];
	               if(max<temp) max=temp;
		       }
		       System.out.println(max);
	}

}
