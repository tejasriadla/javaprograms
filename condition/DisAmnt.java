package condition;

import java.util.Scanner;

public class DisAmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amt,dis;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		amt=sc.nextDouble();
		if (amt>=10000)
		{
			dis=amt*0.10f;
			System.out.println("amt above 10000 :" +dis);

		}
		else {
			dis=amt*0.02f;
			System.out.println("amt below 10000 :"+dis);

		}

	}

}
