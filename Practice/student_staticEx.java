package Practice;

class student
	{
		int roll_no;
		String name;
		static String College_Name="MSU";
	}

public class student_staticEx {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	
	{
		student s1 = new student();
		s1.roll_no=20;
		s1.name="revanth";
		
		System.out.println(s1.roll_no);
		System.out.println(s1.name);
		System.out.println(student.College_Name);
		
		student s2 = new student();
		s2.roll_no=10;
		s2.name="sumanth";
		
		System.out.println(s2.roll_no);
		System.out.println(s2.name);
		System.out.println(student.College_Name);
		
			

	}

}
