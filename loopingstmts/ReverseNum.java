package loopingstmts;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n= sc.nextInt();
		int r,rev=0;
		
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev);


	}

}
