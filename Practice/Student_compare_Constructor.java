package Practice;

import java.util.Arrays;

public class Student_compare_Constructor {

	public static void main(String args[]) {
		StudentList_Constructor student[] = new StudentList_Constructor[3];

		student[0] = new StudentList_Constructor();
		student[0].setName("Revanth");
		student[0].setGrade(19);

		student[1] = new StudentList_Constructor();
		student[1].setName("Sumanth");
		student[1].setGrade(12);

		student[2] = new StudentList_Constructor();
		student[2].setName("Faaty");
		student[2].setGrade(16);

		System.out.println("Order of students before sorting is: ");

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName() + "\t"
					+ student[i].getGrade());
		}

		Arrays.sort(student, new StudentGrade_Compare_constructor());
		System.out
				.println("Order of students after sorting by student grade is");

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName() + "\t"
					+ student[i].getGrade());
		}

		Arrays.sort(student, new StudentName_compare_constructor());
		System.out
				.println("Order of students after sorting by student name is");

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName() + "\t"
					+ student[i].getGrade());
		}
	}

}
