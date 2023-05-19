package loopingstmts;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n= sc.nextInt();
		int tem = n,r,rev=0;
		
		while(n>0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
			
		}
			if(tem==rev) 
				System.out.println("given num is palindrome :"+tem);

		
			else 
		{
				System.out.println("not a palindrome");
		}
	}
	
}
