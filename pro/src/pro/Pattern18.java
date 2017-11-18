package pro;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++){
			for(int j=9;j>=i;j--){
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(" "+k);
			}
			for(int k=i-1;k>=1;k--){
				System.out.print(" "+k);
			}
			System.out.println();
		}
	}

}
