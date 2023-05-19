package condition;
import java.util.Scanner;
public class tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sal,tax;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		sal=sc.nextDouble();
		if (sal<25000)
		{
			tax=sal*0.10;
			System.out.println("salary with tax 10% :" +tax);

		}
		else {
			tax=sal*0.15;
			System.out.println("salary with tax 15%  :"+tax);

		}

	}


	

}
