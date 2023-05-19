package condition;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner src= new Scanner(System.in);
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
		    	break;
		}
	



	}

}
