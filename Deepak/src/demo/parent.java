package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class parent {

	public void m1() throws FileNotFoundException {
		FileReader r=new FileReader("abc.txt");

		System.out.println("parent class method");
		
	}
	
}
