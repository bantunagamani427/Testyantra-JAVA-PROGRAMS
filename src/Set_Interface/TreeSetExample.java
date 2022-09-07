package Set_Interface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet hs=new TreeSet();
		hs.add(12);
		hs.add(23);
		hs.add(34);
		hs.add(1);
		hs.add(12);
		//hs.add("java");
		//hs.add(null);
		System.out.println("asecnding order");
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	System.out.println(hs);	
	
	}

}
