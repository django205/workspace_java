
	
	class Display{
		public  void wish(String name){//synchronized keyword is used for
			//sequential execution of thread
			for(int i=0;i<10;i++){                       //only one thread can get lock for a object at a time 
				System.out.println("good morning "+name);
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					System.out.println(name);
				}
			}
		}
	}
	
	class mythread extends Thread{
		Display d;
		String n;
		mythread(Display d,String name){
			this.d=d;
			n=name;
		}
		public void run(){
			d.wish(n);
		}
		
	}
public class Synchronizeddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Display d=new Display();
        mythread t1=new mythread(d,"django");
		mythread t2=new mythread(d,"yogesh");
		t1.start();
		t2.start();
	}

}
