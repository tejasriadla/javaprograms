package condition;
import java.util.Scanner;
public class EorO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		a=sc.nextInt();
		if (a%2==0)
		{
			System.out.println("given num is even :" +a);

		}
		else {
			System.out.println("given num is odd :"+a);

		}

	}

}
