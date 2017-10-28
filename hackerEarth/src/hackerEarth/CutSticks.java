package hackerEarth;
import java.util.*;
public class CutSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	       
	        for(int arr_i=0; arr_i < n; arr_i++){
	        	arr[arr_i] = in.nextInt();
	              }
Arrays.sort(arr);
System.out.println(n);
for(int i=0;i<n-1;i++)if(arr[i]!=arr[i+1]) System.out.println(n-(i+1));

	}
}
