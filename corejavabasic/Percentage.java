package corejavabasic;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maths,eng,scen;
	
		float total, perct;
		
		Scanner src = new Scanner(System.in);
		System.out.println("enter nums");
		maths = src.nextInt();
		eng=src.nextInt();
		scen=src.nextInt(); 
		
		total=maths+eng+scen;
		perct=(total/300)*100;
		System.out.println("total marks :"+total);
		System.out.println("percentage :"+perct);

	}
}