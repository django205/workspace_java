package hackerEarth;
import java.util.*;
public class SavethePrisoner {


    static int saveThePrisoner(int n, int m, int s){
        // Complete this function
      /*  int c=0;
        for(int i=s;i<s+m;i++)
        {c++;
     if(c==m) c=i;}   
        return c;*/
    
//        int p;
//        p=s;
//        while(m>0){
//        	if(p>n) p=1;
//        	
//        	p++;
//        	m--;
//        }
//        return p-1;
    	if((s+m-1)%n==0) return n;
    	
    	else return (s+m-1)%n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
	}

}
