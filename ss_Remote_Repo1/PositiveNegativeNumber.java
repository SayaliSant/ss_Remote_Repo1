package ss_Remote_Repo1;

import java.util.Scanner;

public class PositiveNegativeNumber {
	public static void main(String[] args) {
		//Take input from user
		System.out.println("Enter a number : ");
		Scanner sc= new Scanner(System.in);
		float f1 = sc.nextFloat();
		
		if(f1>=0)
		{
			System.out.println(f1  + "  is potitive number");
		}
		System.out.println(f1  + "  is negative number");
		
		sc.close();
}
}
