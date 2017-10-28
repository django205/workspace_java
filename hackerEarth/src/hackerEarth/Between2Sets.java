package hackerEarth;

import java.util.Scanner;

public class Between2Sets {

	static int gcd(int a,int b){
	int ans;
		if(b==0) ans=a;
		else ans=gcd(b,a%b);
	return ans;
	}
	static int lcm(int a,int b){
	return (a*b)/gcd(a,b);
		}
	static int lcm(int []a){
		int result=a[0];
		for(int i=1;i<a.length;i++){
			
			result=lcm(result,a[i]);
		}
		return result;
	}
	static int gcd(int []b){
		int r=b[0];
		for(int i=1;i<b.length;i++){
			r=gcd(r,b[i]);
		}
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int[] a = new int[n];
	         
	        for(int i=0; i < n; i++){
	            a[i] = in.nextInt();  
	          
	        }
	        int[] b = new int[m];
	        for(int i=0; i < m; i++){
	            b[i] = in.nextInt();
	        }
	        
		int mul=lcm(a);
		
		int mul2=gcd(b);
		
		int z=0,c=1;
		//System.out.println(mul+" "+mul2);
		while(mul*c<=mul2){
		if(mul2%(mul*c)==0) {z++;}	
		c++;
		
		System.out.println("mul   :"+mul+"   c  :"+c);
		}
System.out.println(z);
	}

}
