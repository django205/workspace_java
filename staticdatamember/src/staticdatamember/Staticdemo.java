package staticdatamember;
//static members are same for all object
//any change in static data members of one object is reflected in other objects of same class  
public class Staticdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example1 ea=new Example1();
		Example1 eb=new Example1();
		Example1 ec=new Example1();
		Example1 ed=new Example1();
		ea.output();
		eb.output();
		ec.output();
		ed.output();
		
		

	}

}
