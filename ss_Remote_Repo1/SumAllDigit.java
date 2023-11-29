package ss_Remote_Repo1;

import java.util.Scanner;

public class SumAllDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int int1 = sc.nextInt();
		int temp = int1;
		int sum=0;
		
		while(temp>0)
		{   
			int rem = temp%10;
			sum=sum+rem;
			temp=temp/10;
			
		}
		System.out.println(sum + " is sum of all digit of given number");
		sc.close();
	}
}
