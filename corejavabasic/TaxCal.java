package corejavabasic;
import java.util.Scanner; 
public class TaxCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sal, tax;
		Scanner src =new Scanner(System.in);
		System.out.println("enter salary");
		sal=src.nextDouble();
		tax=(sal*12)/100;
		System.out.println(" 12% tax of the  employee salary :"+tax);

		

	}

}
