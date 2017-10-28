package odd;

public class demo {

	public static void main(String[] args) {
		
int large=0;
for(int i=1;i<=11;i++)
{
	if(i%2==0)
	{
		System.out.println("even"+i);
      if(large<i)		
		large=i;
	}
}	
System.out.println("table of"+large+"is ");
	for(int j=1;j<=10;j++){
	
	
	System.out.println("  "+large*j);
}
	
	}
}
