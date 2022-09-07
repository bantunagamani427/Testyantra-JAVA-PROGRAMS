package ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class FetchingObjectsUsing_IteratorInterface {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add("amma");
		a.add("nanna");
		a.add("annayya");
		a.add("chelli");
		a.add("nenu");
		Iterator i=a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			i.remove();

		}
		System.out.println("all objects removed");
		System.out.println(a);
	}

}
