package dynamicProgramming;
//memoization(top down approach)
public class Fibonacci {

	final int MAX=100;
	final int NIL=-1;
	int lookup[]=new int[MAX];
	void initialize(){
		for(int i=0;i<MAX;i++){
			lookup[i]=NIL;
		}
	}
	
	int fib(int n){
		if(lookup[n]==NIL){
			if(n<=1) lookup[n]=n;
			else lookup[n]=fib(n-1)+fib(n-2);
		}
		return lookup[n];
	}
	void show(int n){
		
		for(int i=0;i<n;i++) System.out.println(lookup[i]);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		Fibonacci fibObj=new Fibonacci();
		fibObj.initialize();
		
		System.out.println(fibObj.fib(num));

		fibObj.show(num);
	}

}




/* Java program for Tabulated version (bottom up approach)*/
//public class Fibonacci
//{
//  int fib(int n)
//  {
//    int f[] = new int[n+1];
//    f[0] = 0;
//    f[1] = 1;
//    for (int i = 2; i <= n; i++)
//          f[i] = f[i-1] + f[i-2];
//    return f[n];
//  }
// 
//  public static void main(String[] args)
//  {
//    Fibonacci f = new Fibonacci();
//    int n = 9;
//    System.out.println("Fibonacci number is" + " " + f.fib(n));
//  }
// 
//}