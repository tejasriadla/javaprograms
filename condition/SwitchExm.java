package condition;

import java.util.Scanner;

public class SwitchExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
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
		}
	}

}
