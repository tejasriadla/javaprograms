package loopingstmts;

import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		long n= sc.nextLong();
		for(int i=1;i<=n;i++)
		{
			int r=i*i;
			System.out.println(r);
		}
	}

	

}
