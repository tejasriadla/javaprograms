package loopingstmts;

import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		long n= sc.nextLong();
		long sum = 0;
		for(int i=1;i<=n;i++)
		{
			int p=i*(i+1);
			sum=+p;
			System.out.print( +i+ " * "+(i+1)+"  +  ");
		}
        System.out.print(" = "+sum);
	}

	
}
