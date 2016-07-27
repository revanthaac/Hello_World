package Practice;

public class Employee_THIS {
	
	int id;
	
	String name;
	
	
	Employee_THIS(int id, String name)
			
	{
		this.id = id;
		this.name = name;
	}
	
	void show()
	
	{
		System.out.println(id+" " +name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Employee_THIS e1 = new Employee_THIS(001,"Revanth");
		Employee_THIS e2 = new Employee_THIS(002,"Sumanth");
		
		e1.show();
		e2.show();

	}

}

