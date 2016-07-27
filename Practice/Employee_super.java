package Practice;

public class Employee_super
	
	{
		int salary=1000;
	}

class HR extends Employee_super
	{
		int salary=2000;
		void display()
		{
			System.out.println("salary" +super.salary);
		}
	}
class Supervariable
 
{
	public static void main(String[] args) {
	
		{
			HR obj = new HR();
			obj.display();
		}
	
}
}
