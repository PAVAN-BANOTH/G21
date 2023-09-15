package in.pavan;

public class SortArray {

	public static void main(String[] args) {
		int[] a = {12, 322, 54,61, 72,12};
		int temp;
		for(int i = 0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]<a[j]) {//< Dse order
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}

			
		}
		System.out.println("After Sorting ");
		for(int i = 0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		

	}

}
