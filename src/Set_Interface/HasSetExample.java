package Set_Interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasSetExample {

	public static void main(String[] args) {
		Set hs=new HashSet();
		hs.add(null);
		hs.add(23);
		hs.add("java");
		hs.add('a');
		hs.add("java");
		hs.add(null);
		hs.add(23);
		hs.add(2);
		hs.add(5);
		//System.out.println(hs);
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(hs);
	}
}
