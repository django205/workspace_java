package sorting;

import java.util.Scanner;

public class BubbleSortRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
int ar[]=new int[n];
for(int i=0;i<n;i++){
	ar[i]=sc.nextInt();
}

bubblesort(ar,n);
for(int i=0;i<n;i++){
	System.out.println(ar[i]);
}
	}

	private static void bubblesort(int[] ar, int n) {
		// TODO Auto-generated method stub
		if(n==1) return;
		
		
		for(int i=0;i<n-1;i++){
			if(ar[i]>ar[i+1]){
				int t=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=t;	
				}
			bubblesort(ar,n-1);
		}
	}

}
