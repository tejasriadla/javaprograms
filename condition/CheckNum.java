package condition;
import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		a=sc.nextInt();
		if (a>0)
		{
			System.out.println("given num is is positive:" +a);

		}
		else if(a==0){
			System.out.println("given num is zero :"+a);

		}else {
			System.out.println("given num is negative :"+a);


	}


	}

}
