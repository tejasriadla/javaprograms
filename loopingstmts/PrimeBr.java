package loopingstmts;

import java.util.Scanner;

public class PrimeBr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=2,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		n=sc.nextInt();
		while(i<n) {
			if(n%i==0) {
				c=c+1;
				break;}
			i++;
			
		}if(c==0)
			System.out.println("num is prime");
		else
			System.out.println("num is not prime");
	}

}
