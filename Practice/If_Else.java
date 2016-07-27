package Practice; /*package name*/

public class If_Else {

	/**
	 * @param args
	 */
	
	/*If_Else()
	{;8
		System.out.println("adding constructor");
	}*/
	public static void main(String[] args)
	
	{
		If_Else obj = new If_Else();
		 obj.ifElseEx();
		
		//ifElseEx();

	}
	public void ifElseEx()
	{
		int x = 20;
		int y = 10;
		
		int z;
		
		z = x+y;
		
		
		if (z == 50)
		{
			{
				if (z < 50)
				System.out.println("Z is less than 55");
			}
			System.out.println("z  is 50 ");
			
		}
		
		else if (z > 55)
			
		{
			System.out.println("z is greater than 55");	
		}
		
		else if (z < 50)
			
		{
			System.out.println("Z is the answer");
			
		}
			
	}

}
