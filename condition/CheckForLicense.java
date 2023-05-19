package condition;
import java.util.Scanner;
public class CheckForLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter age");
		age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println(" eligible");
			
		}else 
		{
			System.out.println("not eligible");
		}

	}

}
