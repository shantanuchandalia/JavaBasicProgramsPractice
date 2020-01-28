package practice;

import java.util.Scanner;

public class Fibonacci_usingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Fibonacci series to be printed");
		int count = scan.nextInt();
		for(int i=0;i<count;i++)
		{
			System.out.println(fib(i));
		}
	}
	public static int fib(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
		return fib(n-1)+ fib (n-2);
		}
	}

}
