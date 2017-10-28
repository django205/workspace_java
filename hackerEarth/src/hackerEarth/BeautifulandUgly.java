package hackerEarth;
import java.util.*;
public class BeautifulandUgly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            int n = in.nextInt();
	            int[] a = new int[n];
	           int f[]=new int[n];
	            
	            a[0]=in.nextInt();
	            int c=0,m=0;
	            for(int i = 1; i < n; i++){
	       int temp=a[i-1];
	                a[i] = in.nextInt();
	            if(a[i]>n) {c++;}
	                
	           // else f[a[i]]++;
	            if(temp>a[i]) m++;
	                    
	            }
//	            for(int i=0;i<n;i++){
//	                if(f[i]>1) c++;
//	            }
	            if(c>0) System.out.println("Ugly");
	            else 
	            if(m>0) System.out.println("Beautiful");
	            else System.out.println("Ugly");
	        }
	        in.close();
	}

}
