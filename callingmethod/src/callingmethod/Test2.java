package callingmethod;

public class Test2 {
	
	int a,b;
	Test2(int i,int j){
		a=i;
		b=j;
	}
	void meth(Test2 t){
		t.a=t.a+2;
		t.b=t.b+3;
	}

}
