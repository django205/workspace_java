class A {
void call(){
	System.out.println("class A call()");
}
}
class B extends A{
void call(){
	System.out.println("class B call()");
}
}
class C extends B {
void call(){
	System.out.println("class C call()");
}
}
class dispatch{

	public static void main(String args[]){
		
		A a=new A();
		B b=new B();
		C c=new C();
		A r;// reference of parent class is used
		r=a;//upcasting
		r.call();
		r=b;
		r.call();
		r=c;
		r.call();
	}
}//runtime polymorphism

