package hackerEarth;

import java.util.Scanner;

public class MagicalWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n=sc.nextInt();
		int [] ascii=new int[n];
		char[] S=sc.next().toCharArray();
		for(int i=0;i<S.length;i++){
			ascii[i]=(int)S[i];
			System.out.println(ascii[i]);
		}
				
	}

}
