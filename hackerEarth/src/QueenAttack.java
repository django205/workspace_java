import java.util.*
;
public class QueenAttack {

	public static void main(String []args){

		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	    
	        int x = in.nextInt();
	        int y = in.nextInt();
	        //find possible directions
	        
	        int rx=n-x;
	        int lx=x;
	        int upy=n-y;
	        int downy=y;
	        int diax=n-x+1;
	        int diay=n-y+1;
	        int rdiax=n-x-1;
	        int rdiay=n-y-1;
	        for(int i=0;i<k;i++){
	        	 int xobs = in.nextInt();
	             int yobs = in.nextInt();
	             
	        }
	}
}
