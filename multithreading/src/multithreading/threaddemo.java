package multithreading;

public class threaddemo extends Thread{
	int k=0;
	public void run(){
		for(int i=1;i<=20;i++){
			
			try{
				if(i==1)
				{
					p();
				}
				
				System.out.println("thread"+i);
				Thread.sleep(30);
			}catch(InterruptedException e){
				System.out.println("interrupted"+e);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	void r()throws Exception{
		System.out.println("r is running"+Thread.currentThread().getName());
		k++;
		if(k>10){ g();}
		else{
		Thread.sleep(10);
		q();}
		System.out.println(k);
	}
	void q()throws Exception{
		System.out.println("q is running");
		k++;
		if(k>10) {g();}
		else{
		Thread.sleep(10);
		q();}
		System.out.println(k);
	}
	void p()throws Exception{
		System.out.println("p is running");
		k++;
		if(k>10) {g();}
		else{
		Thread.sleep(10);
		q();}
		System.out.println(k);
	}
	void g(){
		
	}
	public static void main(String[] args){
		threaddemo t=new threaddemo();
		t.setName("mythread");
         t.start();
        // threaddemo t1=new threaddemo();
        // t1.start();
         //threaddemo t2=new threaddemo();
         //t2.start();
	}
}
