package sorting;

public class SelectionSort {
	
	void sort(int []a){
		int n=a.length;
		
		for(int i=0;i<n-1;i++){
		int index=i;
		for(int j=i+1;j<n;j++){
			if(a[j]<a[index]) index=j;
		}
		int temp=a[index];
		a[index]=a[i];
		a[i]=temp;
		}
	}
	 // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
	}

}
