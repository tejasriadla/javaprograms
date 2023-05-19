package condition;

import java.util.Scanner;

public class CheckVowelOrCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any letter ");
		ch=sc.next().charAt(0);
		
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch+ " is vowel");
				break;
			default:
		    	System.out.println(ch+" given letter is consonant");
		    	break;
		}

	}

}
