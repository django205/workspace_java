package odd;

public class method {
	static int e,o;
		int even(){
int m1=0;			for(int i=1;i<=10;i++){
				if(i%2==0)
					System.out.println("even    "+i);
				if(m1<i)
					m1=i;
		}
		return m1;	
		}
	static int odd(){
		int m2=0;
		for(int j=1;j<=10;j++){
if(j%2!=0)
{
	System.out.println("odd   "+j);
			if(m2<j){
				
			
				m2=j;
			}
}
		}return m2;
	}
	static{
		System.out.println("static block     ");
		 o=odd();
		 
		 
	}
	method(){
		
		System.out.println("constructor is called     ");
		 e=even();
		 
		 
		 
		
	}
	int max(int a,int b){
		return a+b;
	}
	
	void table(int t){
		
		for(int k=1;k<=10;k++){
			System.out.println(t*k);
		}
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
   method met=new method();
  int t1= met.max(e, o);
  
  met.table(t1);
  
  
  
		
		
		
		
		
		
	}

}
