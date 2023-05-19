package condition;
import java.util.Scanner;
public class CallCharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nocall,bill;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		nocall=sc.nextDouble();

		if (nocall<200)
		{
			bill=nocall*1;
			System.out.println("bill ammt  :" +bill);

		}
		else {
			bill=nocall*3;
			System.out.println("bill ammt :"+bill);

		}

	}


	}


