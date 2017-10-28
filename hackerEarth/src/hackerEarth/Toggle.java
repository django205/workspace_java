package hackerEarth;

import java.util.Scanner;

public class Toggle {

   public static void main(String args[] ) throws Exception {
      
       Scanner s = new Scanner(System.in);
       char[] str = s.next().toCharArray();
      for(int i=0;i<str.length;i++){
    	  if(str[i]>=97&&str[i]<=122){
    		  str[i]-=32;
    	  }else{
    		  str[i]+=32;
    	  }
      }
       System.out.println(str);
    
}
}