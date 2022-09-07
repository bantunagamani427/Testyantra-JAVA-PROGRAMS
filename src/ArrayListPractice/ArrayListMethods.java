package ArrayListPractice;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add("12");
		a.add("java");
		a.add(true);
		a.add(234.6);
		System.out.println(a);

		a.add("java");
		Integer i=new Integer(100);
		a.add(i);
		System.out.println("after adding duplicates"+a);
		a.remove("java");
		a.add(null);
		a.add(null);
		a.remove(2);
		a.remove(i);
		a.get(4);
		a.set(4, "bava");
		System.out.println("size"+a.size());
		
		ArrayList a1=new ArrayList<>();
		a1.add(0, "amma");
		a1.add(1, "q");
	a1.addAll(a);
	System.out.println(a1);
	a1.removeAll(a);
	System.out.println(a1);

	}

}
