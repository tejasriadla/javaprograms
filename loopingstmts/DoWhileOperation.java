package loopingstmts;

import java.util.Scanner;

public class DoWhileOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc= new Scanner(System.in);
		do {
		System.out.println("enter choice");
		char choice=sc.next().charAt(0);
		int a,b,c;
		System.out.println("enter 2 values");
		a=sc.nextInt();
		b=sc.nextInt();
		switch(choice)
		{
			case '+':
				c=a+b;
				System.out.println("addition of 2 num :"+c);
				break;
			case '-':
				c=a-b;
				System.out.println("subtraction of 2 num :"+c);
				break;
			case '*':
				c=a*b;
				System.out.println("multiplication of 2 num :"+c);
				break;
			case '/':
				c=a/b;
				System.out.println("division of 2 num :"+c);
				break;
			
			default:
		    	System.out.println("invalid choice");
		    	break;
		}System.out.println("enter c to continue or any key to exit");
		ch= sc.next().charAt(0);
	}while(ch =='c' ||  ch =='C');

	}

}
