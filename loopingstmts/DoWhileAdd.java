package loopingstmts;

import java.util.Scanner;

public class DoWhileAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		char ch;
		Scanner src = new Scanner(System.in);
	
		do {
			System.out.println("enter 2 values");
			a=src.nextInt();
			b=src.nextInt();
		
			c=a+b;
		
			System.out.println("ADDITION "+a+" AND "+b+ " IS :"+c);
			System.out.println("enter c to continue or any key to exit");
			ch= src.next().charAt(0);
		}
		while(ch=='c' || ch=='C');
		
	}

}
