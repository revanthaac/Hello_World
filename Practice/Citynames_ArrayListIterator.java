package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Citynames_ArrayListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> places = new ArrayList<String>();

		places.add("Plainsboro");
		places.add("Nashville");
		places.add("Murray");
		places.add("Franklin");
		places.add("Tampa");

		System.out.println("City List : ");

		Iterator<String> itr = places.iterator();

		while (itr.hasNext()) {
			Object nxt = itr.next();
			System.out.println("		" + nxt);
		}

		System.out.println("***********");

		ListIterator<String> listItr = places.listIterator();
		while (listItr.hasNext())

		{

			Object nxt = listItr.next();

			listItr.set(nxt + " City ");

		}

		System.out.println("Changed List is : ");

		itr = places.iterator();

		while (itr.hasNext())

		{

			Object nxt = itr.next();

			System.out.println("		" + nxt);
		}
	}
}
