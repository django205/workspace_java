package hackerEarth;

public class Largest_3_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={10, 4, 3, 50, 23, 90};
		int first=-1,second=-1,third=-1;
		for(int i=0;i<a.length;i++){
			if(a[i]>first){
				third=second;
				second=first;
				first=a[i];
			}
			else if(a[i]>second){
				third=second;
				second=a[i];
			}
			else if(a[i]>third){
				third=a[i];
			}
		}
		
		System.out.println(first+"   "+second+"     "+third);
	}

}
