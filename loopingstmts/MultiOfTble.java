package loopingstmts;

import java.util.Scanner;

public class MultiOfTble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		int i,r;
		for(i=1;i<=10;i++)
		{
			r=num*i;
			System.out.println(num+" * "+i+" = "+r);
		} 

	}

}
