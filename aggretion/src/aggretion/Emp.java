package aggretion;

public class Emp {
     Address a;//aggregation
	String name;
	int rollno;
	Emp(){
		name="yogesh";
		rollno=605;
	}
	Emp(String n,int r,Address as){
		name=n;
		rollno=r;
		a=as;
	}
	public void display(){
		System.out.println(name+"   "+rollno+"   "+a.street+"   "+a.city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a1=new Address("galino 3","Dwarka");
		
		Emp e1=new Emp("harry",212,a1);
		
		
		e1.display();

	}

}
