package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap m=new HashMap();
		
		m.put(10, "Ravsaheb");
		
		m.put(11, "Rajendra");

		m.put(12, "patil");
		System.out.println(m);
		
		System.out.println(m.put(12, "Bagul"));
		Set s=m.keySet();
		System.out.println(s);
		Collection c=m.values();
		System.out.println(c);
		Set s1=m.entrySet();
		System.out.println(s1);
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
		
			
		}
		
	

		
		
	}

}
