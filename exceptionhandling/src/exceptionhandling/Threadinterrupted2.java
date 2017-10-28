package exceptionhandling;

class myThread1 extends Thread{
	public void run(){
		for(int i=0;i<10000;i++){
			System.out.println("child thread");
		}
		System.out.println("i want to sleep ");
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
		System.out.println("thread got interrupteed");	
		}
	}
}
public class Threadinterrupted2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myThread1 t=new myThread1();
	t.start();
	t.interrupt();// it is used to interrupt a sleeping or waiting thread
	System.out.println("end of main()");
	}
	}


