package ss_Remote_Repo1;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		//Take input from user
		System.out.println("Enter the 3 numbers : ");
		Scanner sc= new Scanner(System.in);
		float f1 = sc.nextFloat();
		float f2 = sc.nextFloat();
		float f3 = sc.nextFloat();
		
		
			if(f1==f2 && f1==f3)
			{
				System.out.println("All numbers are same");
			}
		
			else if(f1>f2 && f1>f3)
			{
				System.out.println(f1  + "  is gretest number than " + f2 + " and " + f3);
			}
			else if(f2>f3)
			{
				System.out.println(f2  + "  is gretest number than " + f1 + " and " + f3);
			}
			else 
			{
				System.out.println(f3  + "  is gretest number than " + f1 + " and " + f2);
			}
		
			sc.close();
			
	}			

}
