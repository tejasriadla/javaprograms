package condition;
import java.util.Scanner;
public class Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		char ch= sc.next().charAt(0);
		if (ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
		{
			System.out.println("given letter is vowel :" +ch);

		}
		else
		{
			System.out.println("given letter is consonant :"+ch);

		}

	}


	}


