package corejavabasic;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader1 {

	public static void main(String[] args) throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		int a,b,c;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 2 numbers");
        a=Integer.parseInt(reader.readLine());
        b=Integer.parseInt(reader.readLine());
        c = a+b;
        System.out.println("addition of " +a+" and " +b+ "is:" +c);
        
	}

}
