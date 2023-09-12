package in.pspk;

import java.util.Scanner;

public class BetweenTwoNoPrime {

	public static void main(String[] args) {
		int n1,n2,i,j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 no");
	n1=sc.nextInt();
	n2=sc.nextInt();
	for( i=n1;i<=n2;i++) {
		for(j = 2;j<=i;j++) {
			if(i%j==0)
				break;
		}
		if(i==j)
			System.out.print(j+" ");
	}
	

	}

}
