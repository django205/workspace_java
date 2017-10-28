package exceptionhandling;


class myThread extends Thread{
	public void run(){
		try{
		for(int i=0;i<10;i++){
			System.out.println("child thread");
			Thread.sleep(2000);
		}
		}
		catch(InterruptedException e){
		System.out.println("thread got interrupteed");	
		}
	}
}


public class Threadinterrupteddemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myThread t=new myThread();
	t.start();
	t.interrupt();// it is used to interrupt a sleeping or waiting thread
	System.out.println("end of main()");
	}

}
