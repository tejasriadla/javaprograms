package corejavabasic;
import java.util.Scanner;
public class SimpleIntrst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p,t,r,si;
		Scanner src= new Scanner(System.in);
		System.out.println("enter nums");
		p=src.nextInt();
		t=src.nextInt();
		r=src.nextInt();
		si=(p*t*r)/100;
		System.out.println("simple interst :"+si);

	}

}
