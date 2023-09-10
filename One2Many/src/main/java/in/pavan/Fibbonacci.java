package in.pavan;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0,b=1,c,count=10;
		 System.out.print(a+" "+b);
		for(int i = 2;i<=count;i++) {
			c = a + b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
		/*int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }*/
		

	}

}
