package Practice;

public class overloading_ex {

	
	public static void main(String[] args) 
	{
		 overloading_ex obj1= new overloading_ex();
	       obj1.overloading_ex1(13);
	       obj1.overloading_ex1(1.02,19.02);
	}

	
	
		   public int overloading_ex1(int x)
		   { 
		       System.out.println("First ");
		       return x;
		   }
		   public double overloading_ex1(double x1, double y1)
		   {
		       System.out.println("Second");
		       return x1-y1;
		   }
		

}

