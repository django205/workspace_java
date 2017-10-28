package hackerEarth;
import java.util.*;
public class TraderProfit {
	 static int traderProfit(int k, int n, int[] A) {
	        // Complete this function
	    int tran=0,i=0,j=0;
	    int profit=0;
	    while(tran<=k){
		 
	    	for(i=0;i<n-1;i++){
	    	if(A[j]<A[i+1]) {
	    		profit=A[i+1]-A[j]; 
	    	tran++;
	    	i++;
	    	
	    	}
	    	j++;
		 }
		 if(i==n) break;
	    }
	 
	 return profit;
	 }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            int k = in.nextInt();
	            int n = in.nextInt();
	            int[] arr = new int[n];
	            for(int arr_i = 0; arr_i < n; arr_i++){
	                arr[arr_i] = in.nextInt();
	            }
	            int result = traderProfit(k, n, arr);
	            System.out.println(result);
	        }
	        in.close();
	}

}
