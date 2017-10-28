package multithreading;

public class Mythread extends Thread{
public void run(){
	for(int i=1;i<=10;i++){
		
	try{
	System.out.println("child thread"+i);
	Thread.sleep(1000);
	}
	catch(InterruptedException e){
		
		}

	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
Mythread t1=new Mythread();

t1.start();
Mythread t2=new Mythread();
t2.start();
Mythread t3=new Mythread();
t3.start();
System.out.println(t1.getName());
Thread.currentThread().setName("django");
System.out.println(Thread.currentThread().getName());
for(int i=1;i<=10;i++){
	try{
System.out.println("main thread"+i);
	Thread.sleep(1000);}
catch(InterruptedException e){
	
              }

      }
	}
}