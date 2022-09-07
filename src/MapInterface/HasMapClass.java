package MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HasMapClass {

	public static void main(String[] args) {
		HashMap hm=new HashMap<>();
		hm.put(10, "idly");
		hm.put(20, "java");
		hm.put(10, "bannu");
		hm.put(30,true);
		hm.put(new Object(), 23);
		hm.put(1, "bannu");
		hm.put(null, null);
		hm.put(null,4);
		hm.put(4, null);
		hm.put(3,null);
		//System.out.println(hm);
		System.out.println("**********keys********");
		Set ks = hm.keySet();
		for(Object i:ks) {
			System.out.println(i);
		}
		System.out.println("*********values*********");
		Collection vs = hm.values();
		for(Object t:vs) {
			System.out.println(t);
		}
		System.out.println("***********entryset*******");
		Set es = hm.entrySet();
		for(Object e:es) {
			System.out.println(e);
		}

	}

}
