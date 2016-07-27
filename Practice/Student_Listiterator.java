package Practice;

import java.util.ArrayList;

public class Student_Listiterator {
	private String Sname;
	private int rollno;
	private int age;
	 public Student_Listiterator(String Sname,int roll,int age) 
	 {
		this.Sname=Sname;
		this.rollno=roll;
		this.age=age;
		
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Student_Listiterator> studentadd=new ArrayList<Student_Listiterator>();
	     studentadd.add(new Student_Listiterator("hari", 1, 12));
	     studentadd.add(new Student_Listiterator("lori", 2, 18));
	     studentadd.add(new Student_Listiterator("bhaskar", 2, 22));
	    
	     for (Student_Listiterator temp1:studentadd) {
	    	System.out.println(temp1.getSname());
	    	System.out.println(temp1.getAge());
	    	System.out.println(temp1.getRollno());

			System.out.println("***********");
		}
	   /*     Iterator itr=studentadd.iterator();
	     while(itr.hasNext())
	     {
	    	 Object o(Student)=itr.next();
	    
	    	 System.out.println(o);
	     }*/

	}

}
