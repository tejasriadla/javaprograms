package loopingstmts;

import java.util.Scanner;

public class DoWhileCheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		
		Scanner sc = new Scanner(System.in);
		char c;
		char c1;
		do {
			switch(ch)
			{case 1:
				
			System.out.println("enter num");
			int a=sc.nextInt();
			if (a%2==0)
			{
				System.out.println("given num is even :" +a);

			}
			else {
				System.out.println("given num is odd :"+a);

			}break;
			case 2:
			{System.out.println("enter num");
			a=sc.nextInt();
			if (a>0)
			{
				System.out.println("given num is is positive:" +a);

			}
			else if(a==0){
				System.out.println("given num is zero :"+a);

			}else {
				System.out.println("given num is negative :"+a);}
				break;}

			case 3:{
			System.out.println("enter number");
			int n= sc.nextInt();
			int tem = n,r,rev=0;
			
			while(n>0)
			{
				r=n%10;
				rev=(rev*10)+r;
				n=n/10;
				
			}
				if(tem==rev) 
					System.out.println("given num is palindrome :"+tem);

			
				else 
			
					System.out.println("not a palindrome");
			
		} break;
			
			case 4:{
				System.out.println("enter number");
				int n= sc.nextInt();
				int orgnum = n, rem=0,res=0;
				
				while(orgnum != 0) {
					rem=orgnum%10;
					res=(int) (res+Math.pow(rem,3));
					orgnum=orgnum/10;
					
				}
					if(res==n) {
						System.out.println(n+": is armstrong num");
					}else {
						System.out.println("not an armstromg");
					}
			}break;
			default :
				System.out.println("invalid");
				break;
			}
			 System.out.println("enter c to continue or any key to exit");
			    c1= sc.next().charAt(0);}}
			while(c1 =='c' ||  c1 =='C');
		
			
			
			
		
	

}}
