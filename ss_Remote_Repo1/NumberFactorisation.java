package ss_Remote_Repo1;

import java.util.Scanner;

public class NumberFactorisation {
	public static void main(String[] args) {
		//Take input from user
		System.out.println("Enter a number ");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp = n;
		
		for(int i=1;i<=temp; i++)
		{
			
			if(temp%i==0)
			{ 
				System.out.println(i + " is factor of temp");
			}
		}
		
		sc.close();
		
		
	}

}
