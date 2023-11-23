package ss_Remote_Repo1;

import java.util.Scanner;

public class NumberPower {
	
	public static void main(String[] args) {
		//Take input from user
		System.out.println("Enter the number for which you want to calculate the power: ");
		Scanner sc= new Scanner(System.in);
		float f1 = sc.nextFloat();
		System.out.println(f1*f1 + "  is square of number  " + f1);
		System.out.println(f1*f1*f1 + "  is cube of number  " + f1);
		System.out.println(f1*f1*f1*f1 + "  is 4th power of number  " + f1);
		
		sc.close();
			
	}			

}
