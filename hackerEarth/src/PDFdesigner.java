import java.util.Scanner;

public class PDFdesigner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
	        int[] h = new int[26];
	        for(int h_i=0; h_i < 26; h_i++){
	            h[h_i] = in.nextInt();
	        }
	          char[] word=in.next().toCharArray();
	       int value=0;
	          for(int i=0;i<word.length;i++){
	          if(i==0) value=h[word[0]-97];
	          else{
	        	  if(value<h[word[i]-97]) value=h[word[i]-97];
	        	  }
	       }
	          System.out.println(word.length);
	          System.out.println(value);
	          //value=value-97;
	         // System.out.println(h[value]);
	          
	          System.out.println(word.length*value);
	}

}
