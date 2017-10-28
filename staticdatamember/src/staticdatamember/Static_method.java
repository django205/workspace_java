package staticdatamember;

public class Static_method {
	
      static int i=10;
      int j=20;
      static void print(){
    	  int k=30;
    	  
    	  System.out.println("i   "+i);
     // System.out.println("j   "+j);
      System.out.println("k   "+k);
      
      }
      void display(){
    	  System.out.println("i    "+i);
    	  System.out.println("j   "+j);
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static_method ss=new Static_method();
	
		Static_method.print();//without object call of static mehtod print()
		//ss.print();
		ss.display();

	}

}
