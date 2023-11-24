package ss_Remote_Repo1;

import java.util.Scanner;

public class NumberOfDaysInMonth {
	public static void main(String[] args) {
		//Take input from user
		System.out.println("Enter a number between 1 to 12 ");
		Scanner sc= new Scanner(System.in);
		int ch = sc.nextInt();
		if(ch==2)
		{
			System.out.println("Number of days can be 28 or 29 ");
		}
		else if(ch==1 || ch==3 || ch== 5 || ch==7 || ch==8 || ch==10 || ch==12)
		{
			System.out.println("Number of days are 31 ");
		}
		else
		{
			System.out.println("Number of days are 30 ");
		}
		
		
	sc.close();	
	}
}
