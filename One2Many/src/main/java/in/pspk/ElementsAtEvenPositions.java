package in.pspk;

public class ElementsAtEvenPositions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {22, 36, 56 , 84 , 89};
		for(int i = 0 ; i <=arr.length-1; i++) {
			if(i %2 !=0) {
				System.out.println("Even Position elements  :"+arr[i]+ " ");
				System.out.print("Index Position elements  :"+ i + " ");
				
			}
				
		}
		
	}

}
