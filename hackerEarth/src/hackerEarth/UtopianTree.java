package hackerEarth;
import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int total=0;
      
        for(int a0 = 0; a0 < t; a0++){
         int n = in.nextInt();
        
        int h=1,c=0;
        	for(int i=0;i<=n;i++){
        		if(i==0) {
        			total=h;
        		
        		}
        		else{
        			if(i%2==0) h=h+1;
        			else h=2*h;
        			
        			total=h;
        			
               	}
        	            }
        	System.out.println(total);
        }

    
        
	       
        
	}

}
