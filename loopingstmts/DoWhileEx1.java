package loopingstmts;

import java.util.Scanner;

public class DoWhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		char ch ;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("enter any choice ");
		choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("sunday");
				break;
			case 2:
				System.out.println("monday");
				break;
			case 3:
				System.out.println("tuesday");
				break;
			case 4:
				System.out.println("wednesday");
				break;
			case 5:
				System.out.println("thursday");
				break;
			case 6:
				System.out.println("friday");
				break;
			case 7:
				System.out.println("saturday");
				break;
			default:
		    	System.out.println("invalid choice");}

		    System.out.println("enter c to continue or any key to exit");
		    ch= sc.next().charAt(0);}
		
			while(ch =='c' ||  ch =='C');
	}
}
