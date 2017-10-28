package multithreading;

public class Thread1 extends Thread{
	
	
		public void run(){
			for(int i=0;i<10;i++){
				System.out.println("hello thread");
			}
		}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1();
		Mythread t2=new Mythread();
	    t1.start();
	    t2.start();
	
	}
	

}
