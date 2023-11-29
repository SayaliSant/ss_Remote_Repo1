package ss_Remote_Repo1;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int int1 = sc.nextInt();
		int reverse=0;
		int temp = int1;
		
		while(temp>0)
		{   
			int remainder = temp % 10;  
			reverse = reverse * 10 + remainder;  
			temp = temp/10;  
		}
		System.out.println(reverse + " is reverse number");
		sc.close();
		
	}

}
