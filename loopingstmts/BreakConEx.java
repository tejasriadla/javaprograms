package loopingstmts;

public class BreakConEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("use of break :");
		for(int i=0;i<=10;i++) {
			System.out.print(i+" ");
			if(i==5)
				break;
		}
		
		System.out.println("\n\n use of continue :");
		for(int j=0;j<=10;j++) {
			
			if(j==5)
				continue;
	
		System.out.print(j+" ");
		}
	}

}
