package corejavabasic;

import java.util.Scanner;

public class ArithmeticOpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,c1,c2;
		float c3,c4;
		
		
		Scanner src = new Scanner(System.in );
		System.out.println("enter any 2 values");
		a=src.nextInt();
		b=src.nextInt();
		c=a+b;
		c1=a-b;
		c2=a*b;
		c3=a/b;
		c4=a%b;
		System.out.println("a+b : "+c);
		System.out.println("a-b : "+c1);
		System.out.println("a*b : "+c2);
		System.out.println("a/b : "+c3);
		System.out.println("a%b : "+c4);
		System.out.println("THANK YOU ");
	}

}
