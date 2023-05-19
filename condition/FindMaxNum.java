package condition;
import java.util.Scanner;
public class FindMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 num");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		if (a>b & a>c)
		{
			System.out.println(" max num :" +a);

		}
		else if(b>a & b>c)
		{
			System.out.println("max num :" +b);

		}
		else {
			System.out.println("max num :"+c);

		}

	}

}
