package hackerEarth;
import java.util.*;
public class Valleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        char [] str=sc.next().toCharArray();
	        int level=0,c=0;
	        
	        for(int i=0;i<str.length;i++){
	            if(str[i]=='U') level++;
	            else level--;
	            if(level==0&&str[i]=='U') c++;
	            
	        }
	        System.out.println(c);
	}

}
