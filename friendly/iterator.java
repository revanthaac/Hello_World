package friendly;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("AAAA");
		list1.add("BBBB");

		System.out
				.println("the element at the first elemt is =" + list1.get(0));

		String s1 = (String) list1.get(1);
		System.out.println(s1);
		System.out.println("-------------------------");
		
		
		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) // using hasNext iterator
		{
			Object obj1 = itr.next();
			System.out.println(obj1);
		}
		System.out.println("using hasNext"); 
		System.out.println("-------------------------");
		
		
		for (Object obj : list1) {
			System.out.println(obj);// enhanced for loop
		}
		
		System.out.println(" using enhabnced loop"); 
		System.out.println("-------------------------");

		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i)); //for loop

		}
		System.out.println("using general for"); 
		System.out.println("-------------------------");

	}

}
