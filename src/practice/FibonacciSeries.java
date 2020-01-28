package practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//top 10 fibonacci series
		int [] k;
		k = new int[10];
		k[0]=1;
		k[1] = 1;
		for(int i=0;i<8;i++)
		{
			k[i+2]=k[i+1]+k[i];
		}
		
		//printing the numbers in the array
		
		for(int i=0;i<10;i++)
		{
			System.out.println(k[i]);
		}
	}
}
