package Exception;

import java.util.Scanner;

public class Voting {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int age=s.nextInt();
		if(age<18)
		{
			throw new YoungerAgeException ("you are not eligle for voting");
		}
		else
		{
			System.out.println("you can vote successfully");
		}
	}
}

