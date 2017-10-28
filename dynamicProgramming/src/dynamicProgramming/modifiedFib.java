package dynamicProgramming;
import java.math.BigInteger;
import java.util.*;
public class modifiedFib {

	    public static BigInteger fib(int t1,int t2,int n){
      
	    	 BigInteger f[] = new BigInteger[n+1];
	       f[0] = BigInteger.valueOf(t1);
	       f[1] = BigInteger.valueOf(t2);
	       for (int i = 2; i <=n; i++)   
	    	   f[i]=f[i-2].add(f[i-1].multiply(f[i-1]));
	           
	       return f[n-1];
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	        int t1=sc.nextInt();
	        int t2=sc.nextInt();
	        int n=sc.nextInt();
	        System.out.println(fib(t1,t2,n));
	}

}
