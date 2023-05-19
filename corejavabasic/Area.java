package corejavabasic;
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,l,w,a,b;
		double c,r1,t;
		
		Scanner src = new Scanner(System.in);
		System.out.println("enter r values");
		r=src.nextInt();
		c= 3.14* r* r;
		System.out.println("area of circle :" +r);
		
		System.out.println("enter l ,w values");
		l=src.nextInt();
		w=src.nextInt();
		r1= l * w;
		System.out.println("area of rectangle :" +r1);

		
		System.out.println("enter a,b values");
		a=src.nextInt();
		b=src.nextInt();
		t=0.5*a*b;
		
        System.out.println("area of triangle :" +t);
    

		
	}

}
