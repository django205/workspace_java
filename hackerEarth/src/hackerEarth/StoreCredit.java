package hackerEarth;
import java.util.*;

public class StoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    
		    for(int a=1;a<=n;a++){
		    int c=sc.nextInt();
		    int item=sc.nextInt();
		      int arr[]=new int[item];
		      int x=0,y=0;
		      
		      for(int i=0;i<item;i++){
		    	  arr[i]=sc.nextInt();
		      }
		      
		      
		      
		      for(int i=0;i<item;i++){
		        for(int j=i+1;j<item;j++){
		          if(arr[i]+arr[j]==c){
		           x=i;
		            y=j;
		          }
		        
		        }
		        
		       
		      }
		      System.out.println("Case #"+a+": "+(x+1)+" "+(y+1));
		  }
	}

}
