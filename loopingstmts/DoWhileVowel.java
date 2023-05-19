package loopingstmts;

import java.util.Scanner;

public class DoWhileVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch,c;
		Scanner sc = new Scanner(System.in);
		do {
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
		}System.out.println("enter c to continue or any key to exit");
		c= sc.next().charAt(0);
		
		}while(c =='c' ||  c =='C');


	}

}
