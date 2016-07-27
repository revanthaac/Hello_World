package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(100, "Revanth");
		hm.put(102, "Faaaty");
		hm.put(103, "Sumanth");

		hm.put(null, null);

	String s = hm.get(100);

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

		Iterator it = hm.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			
			it.remove();
		}
		HashMap<Address,Customer>
		
	}

