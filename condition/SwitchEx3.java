package condition;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any choice ");
		choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:		
				System.out.println("enter num");
				int a=sc.nextInt();
				if (a%2==0)
				{
					System.out.println("given num is even :" +a);

				}
				else {
					System.out.println("given num is odd :"+a);

				}break;
			case 2:
				System.out.println("enter num");
				a=sc.nextInt();
				if (a>0)
				{
					System.out.println("given num is is positive:" +a);

				}
				else if(a==0){
					System.out.println("given num is zero :"+a);

				}else {
					System.out.println("given num is negative :"+a);}
			default:
				System.out.println("invaid");
				break;
				
		}

	}

	}
