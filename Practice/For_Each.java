package Practice;

public class For_Each {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int number[] = {1,2,3,4,5};
		
		for (int x : number)
		{
			System.out.print(x);
			System.out.println(" - ");
			
		}
		{
			
			String titles[] ={"Revanth", "Sumanth", "Basi", "Santosh"};
		
			for(String ary : titles)
			{
				System.out.print( ary );
				System.out.print(",");
			}
		}
		

	}

}
