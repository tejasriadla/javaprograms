package loopingstmts;

import java.util.Scanner;

public class DoWhlieArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch ;
		int choice;
		Scanner src= new Scanner(System.in);
	do {
		System.out.println("enter choice");
		choice=src.nextInt();
		int r,l,w,a,b;
		float c,r1,t;
		
		switch(choice)
		{
			case 1:
				System.out.println("enter r values");
				r=src.nextInt();
				c= 3.14f* r* r;
				System.out.println("area of circle :" +r);
				break;
			case 2:
				System.out.println("enter l ,w values");
				l=src.nextInt();
				w=src.nextInt();
				r1= l * w;
				System.out.println("area of rectangle :" +r1);
				break;
			case 3:

				System.out.println("enter a,b values");
				a=src.nextInt();
				b=src.nextInt();
				t= 0.5f*a*b;
		        System.out.println("area of triangle :" +t);
		    
				break;
			
			default:
		    	System.out.println("invalid choice");
		    	break;}
		System.out.println("enter c to continue or any key to exit");
		ch= src.next().charAt(0);
		    	}while(ch =='c' ||  ch =='C');
		
		}
	
	
}
