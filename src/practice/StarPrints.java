package practice;

public class StarPrints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		int i,j;
		
		//-----------------
		//	o
		//	oo 
		//	ooo 
		//	oooo 
		//	ooooo 
		//-----------------
		for(i=1;i<6;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("o");
			}
			System.out.println(" ");
		}
		//-----------------
		// ooooo 
		// oooo 
		// ooo 
		// oo 
		// o 
		//-----------------
		
		for(i=5;i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("o");
			}
			System.out.println(" ");
		}
	}

}
