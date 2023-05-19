package corejavabasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReadSal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int si,p,t,r ;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 3 numbers");
        p=Integer.parseInt(reader.readLine());
        t=Integer.parseInt(reader.readLine());
        r=Integer.parseInt(reader.readLine());
        si=(p*t*r)/100;
        System.out.println("simple interst :" +si);
        

	}

}
