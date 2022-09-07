package ArrayListPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class FetchinObjects_bothDirectionUsing_ListIterator_Interface {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add("atha");
		a.add("mama");
		a.add("anji");

		System.out.println("objects from farword");
		ListIterator i=a.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());	
		}

		System.out.println("objects from backword");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
			i.remove();
		}
		System.out.println("objects are removed");
		System.out.println(a);
	}

}
