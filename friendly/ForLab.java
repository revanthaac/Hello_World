package friendly;

public class ForLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n=15;
		
		if (n%3==0 && n%5!=0)
		{	
			
			System.out.println("Fizz");
		}
		 if (n%5==0 && n%3!=0)
		{	
			
			System.out.println("Buzz");
		}
			
		 if ((n%3==0) && (n%5==0))
		{	
			
			System.out.println("FizzBuzz");
			
		}
		else 
		{
			System.out.println("not possible");
		}
	}

}
