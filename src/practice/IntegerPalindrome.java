package practice;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer to check for Integer Palindrome:");
		int input = sc.nextInt();
		int num = input;
		int rev=0;
		while(num!=0)
		{
			rev = rev *10 + (num % 10);
			num=num/10;
		}
		if (input == rev)
			System.out.println("Its an Integer Palidrome");
		else
			System.out.println("Its not an Integer Palindrome");
		
	}

}
