package hackerEarth;
import java.util.*;
public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        String s = in.next();
	        int k = in.nextInt();
	        
//	        for(int i=0;i<s.length();i++){
//	        int c=0;
//	        	for(int j=0;j<s.length();j++) if(s.charAt(i)==s.charAt(j))c++;
//	        
//	        if(c>=k)System.out.print(s.charAt(i));
//	        }
	        int arr[]=new int[26];
	        for(int i=0;i<s.length();i++){
	        	int num=s.charAt(i);
	        	arr[num-97]++;
	        }
	        for(int i=0;i<26;i++){
	        	if(arr[i]>=k) System.out.print();
	        }
	        in.close();
	}

}
