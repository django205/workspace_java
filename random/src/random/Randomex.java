package random;

import java.util.Random;

public class Randomex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random dice=new Random();
		int n;
		for(int i=1;i<=10;i++){
			n=1+dice.nextInt(6);
			System.out.println(n+"   ");
		}
		
	}

}
