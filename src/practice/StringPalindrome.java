package practice;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a Palindrome:");
		
		String s = scan.next();
		StringBuilder sbl = new StringBuilder(s);
		String revStr = sbl.reverse().toString();
		if(s.equals(revStr))
		{
			System.out.println("This is a palindrome!!");
		}
		else
		{
			System.out.println("This is NOT a palindrome!!");
		}	
		scan.close();
	}

}
