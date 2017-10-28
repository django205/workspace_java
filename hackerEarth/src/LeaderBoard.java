import java.util.Scanner;

public class LeaderBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] scores = new int[n];
	       
	       int rank[]=new int[n];
	        for(int i=0; i < n; i++){
	            scores[i] = in.nextInt();
	            
	            if(i==0) rank[i]=1;
	            else {
	            	if(scores[i]==scores[i-1]) rank[i]=rank[i-1];
	            	else rank[i]=rank[i-1]+1;
	            }
	        }
	       
	        int m = in.nextInt();
	        int[] alice = new int[m];
	        for(int i=0; i < m; i++){
	            alice[i] = in.nextInt();
	            
	        }
	        int point=n-1;
	        for(int j = 0; j < m; j++) {
	            
	            int current_rank = 0;
	        
	            while (point >= 0&&alice[j] > scores[point]) {
	                point--;
	            }
	            
	            if (point == -1) {
	                current_rank = 1;
	            }
	            else if (alice[j] == scores[point]) {
	                current_rank = rank[point];
	            }
	            else if (alice[j] < scores[point]) {
	                current_rank = rank[point] + 1;
	            }
	            
	          System.out.println(current_rank);
	        }

	}

}
