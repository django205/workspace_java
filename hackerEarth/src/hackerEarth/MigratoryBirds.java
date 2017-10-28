package hackerEarth;

import java.util.Scanner;

public class MigratoryBirds {
	static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int ary[] = new int[n];
        for(int i = 0; i < n ; i++ )
        ary[ar[i]]++; 
        int max = 0,maxpos=0;
        for(int i = 0 ; i < n ; i++)
            {
            if(ary[i] > max)
                {
                max = ary[i];
                maxpos = i;
            }
            System.out.println("ary     :"+ary[i]);
        }
        return maxpos;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = migratoryBirds(n, ar);
	        System.out.println(result);
	}

}
