package sorting;
import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
int ar[]=new int[n];
for(int i=0;i<n;i++){
	ar[i]=sc.nextInt();
}
for(int i=0;i<n-1;i++){
	for(int j=0;j<n-i-1;j++){
		if(ar[j]>ar[j+1]){
			int t=ar[j];
			ar[j]=ar[j+1];
			ar[j+1]=t;
		}
	}
//	System.out.println("     passes      :"+i);
}
for(int i=0;i<n;i++){
	System.out.println(ar[i]);
}
	}

}
