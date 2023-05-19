package loopingstmts;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
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
	}

}
