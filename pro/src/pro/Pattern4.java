package pro;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=10;k>=i;k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
