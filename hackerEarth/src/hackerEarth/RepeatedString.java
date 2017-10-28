package hackerEarth;
import java.util.*;
public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();
long n=sc.nextLong();
int a[]=new int[100];
long c=0;
for(int i=0;i<s.length();i++){
	if(s.charAt(i)=='a'){
		c++;
		a[i]=1;
	}
}

int rem=(int) (n%s.length());
n=n/s.length();
c=c*n;
for(int i=0;i<rem;i++){
	if(s.charAt(i)=='a')c++;
}
System.out.println(c);
	}

}
