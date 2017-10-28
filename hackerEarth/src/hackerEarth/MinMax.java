package hackerEarth;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int[] arr = new int[5];
	        long sum=0;
	        int p=0;
	        long min=0,max=0;
	        long []result=new long[5];
	        for(int i=0; i < 5; i++){
	            arr[i] = in.nextInt();
	       
	            
	        }
	        while(p<5){
	        for(int i=0;i<5;i++){
	            if(p==i) continue;
	            sum=sum+arr[i];
	           
	        }
	            result[p]=sum;
	        p++;
	        sum=0;}
	        
	        for(int i=0;i<5;i++){
	        	System.out.println(result[i]);
	            min=result[0];
	            max=result[0];
	            if(min>result[i]) min=result[i];
	            
	            if(max<result[i]) max=result[i];
	        }
	        System.out.print(min+"  "+max);
	}

}
/*
 * public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] nums = new long[5];
        
        long max = 0, min= 0 , sum =0;
        nums[0] = max = min = sum = in.nextLong(); //Read the first value outside the loop, to handle min calculation
        for (int i = 1; i < 5; i++) {
            nums[i] = in.nextLong();
            if(nums[i]>max) max = nums[i];
            if(nums[i]<min) min = nums[i];
            sum += nums[i];
        }
        System.out.println( (sum - max) + " " + (sum - min));
       
    }
}*/
 */