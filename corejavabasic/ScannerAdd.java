package corejavabasic;

import java.util.Scanner;

public class ScannerAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		Scanner src = new Scanner(System.in);
		System.out.println("enter 2 values");
		a=src.nextInt();
		b=src.nextInt();
		
		
		c=a+b;
		
		System.out.println("ADDITION "+a+" AND "+b+ " IS :"+c);
		
			

	}

}
