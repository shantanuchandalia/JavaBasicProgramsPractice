package practice;

public class Tst_reverseString {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Shantanu";
		char [] arr = s.toCharArray();
		String resultString="";
		int len = arr.length;
		for(int i=len-1;i>=0; i--)
		{
			resultString = resultString + arr[i];
		}
		System.out.println(resultString);
	}
}
