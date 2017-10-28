package hackerEarth;

import java.util.Arrays;
import java.util.Scanner;

public class ElectronicShop {
	 static int getMoneySpent(int[] keyboards, int[] drives, int s){
	        // Complete this function
	       int c=0;
	        int []spent=new int[keyboards.length*drives.length];int max=0;
	        for(int i=0;i<keyboards.length;i++){
	            for(int j=0;j<drives.length;j++){
	                spent[c]=(keyboards[i]+drives[j]);
	               c++; 
	                
	            }
	        }
	       // System.out.println(c);
	        int m=0;
	        Arrays.sort(spent);
//	        for(int i=spent.length-1;i>=0;i--){
//	            if(m) 
//	        	m=spent[i];
//	             
//	             System.out.println(m);
//	        }
//	        if (m<=s) return m;
//	        else return -1;
	        //while(spent[c])
	        c--;
	        while(c>=0){
	        	//System.out.println("spent c    :"+spent[c]);
	        	if(spent[c]>s) {m=-1;
	        	c--;
	        	}
	        	
	        	else {m=spent[c];break;}
	        	
	        }
	        return m;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int[] keyboards = new int[n];
	        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
	            keyboards[keyboards_i] = in.nextInt();
	        }
	        int[] drives = new int[m];
	        for(int drives_i=0; drives_i < m; drives_i++){
	            drives[drives_i] = in.nextInt();
	        }
	        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
	        int moneySpent = getMoneySpent(keyboards, drives, s);
	        System.out.println(moneySpent);
	    }
	}


