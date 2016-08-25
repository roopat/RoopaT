
public class NestedLoops {
	public static void main (String args[])
	{
		/*for(int i=0; i<=5; i++)
		{
			System.out.println();
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
		}*/
	/*System.out.println("*********************************");
	for (int i = 1; i <= 5; i++) 
	{
		 for (int j = 1; j <= i; j++) 
		 {
		 System.out.print(i);
		 }
		 System.out.println();
	}*/ 
	
	/*for(int i = 5; i >= 0; i--)
	{
		
		for(int j = 0; j <= i; j++)
		{
			System.out.print(".");
		}
		System.out.println(i);
	}*/
	/*for(int i = 0; i <= 25; i=i+5)
	{
		System.out.print(i+2 +"  ");
	}*/
    /*for(int i = 17; i >= 1; i=i-4)

		System.out.print(i +"  ");
	*/
		/*for(int i = 5; i >= 1; i--)
		{
			
			for(int j = 1; j <= i; j++)
			{
				System.out.print(".");
			}
			System.out.println(i);
		}*/
		/*for (int line = 1; line <= 5; line++) {
			 for (int j = 1; j <= (-1 * line + 5); j++) {
			 System.out.print(".");
			 }
			 for (int k = 1; k <= line; k++) {
			 System.out.print(line);
			 }
			 System.out.println();
			}*/
		/*for(int i = 1; i <= 5; i++)
		{
			
			for(int j = 5; j >= i; j--)
			{
				System.out.print(".");
			}
			System.out.print(i);
			for(int j =1; j<=(i-1) ; j++)
			{
				System.out.print(".");
			}
			System.out.println();
		}*/
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=(9-2*i);j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}



