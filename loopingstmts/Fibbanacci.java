package loopingstmts;

import java.util.Scanner;

public class Fibbanacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int i,n1=0,n2=1,res ;
		System.out.println("fibanacci series");

		for(i=0;i<=num;i++)
		{
			System.out.println(n1);
			res=n1+n2;
			n1=n2;
			n2=res;
		
		}
		
		
		
	}

}
