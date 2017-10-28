package hackerEarth;
import java.util.*;
public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    sc.nextLine();
		    for(int i=1;i<=n;i++){
		    	
		    String str=sc.nextLine();
		      String []arrstr=str.split(" ",-2);
		      System.out.print("Case #"+i+": ");
		      for(int j=arrstr.length-1;j>=0;j--){
		        if(j==0)System.out.print(arrstr[j]);
		        else System.out.print(arrstr[j]+" ");
		      }
		      System.out.print("\n");
	    }
		   
	}
	

}
