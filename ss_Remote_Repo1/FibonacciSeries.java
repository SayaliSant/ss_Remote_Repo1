package ss_Remote_Repo1;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of numbers for fibonacci series");
		int n = sc.nextInt();
		int firstNum = 0;
		int secondNum = 1;
		System.out.print(firstNum +" "+ secondNum);
		
		for(int i=2; i<=n; i++)
		{
			int sum = firstNum + secondNum;
			System.out.print("  "+ sum);
			firstNum = secondNum;
			secondNum = sum;
		}
		
		sc.close();
	}

}
