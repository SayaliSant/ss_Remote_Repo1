package ss_Remote_Repo1;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
	
	//Take input from user
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the second values which you want to convert in hh:mm:ss form");
	int value = sc.nextInt();
	
	int h = value/3600;
	int m = (value -(3600*h))/60;
    int s = (value -(3600*h)-(m*60));
	
	System.out.println("The converted value is" + "hh:" + h + "mm:" + m + "ss:" + s);
	
	
	}

}
