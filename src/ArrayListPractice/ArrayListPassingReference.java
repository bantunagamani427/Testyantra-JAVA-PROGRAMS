package ArrayListPractice;

import java.util.ArrayList;

public class ArrayListPassingReference {

	public static void main(String[] args) {
		ArrayList<Integer >a=new ArrayList<>();
		a.add(23);
		a.add(12);
		a.add(74);
		a.add(100);
		System.out.println(a);

		ArrayList<String>a1=new ArrayList<>();
		a1.add("and");
		a1.add(1, "bava");
		a1.add("we");
		a1.addAll(3, a1);
		a1.set(4, "bannu");
		System.out.println(a1.get(2));
		System.out.println(a1);
		
		ArrayList<Object>a3=new ArrayList<>();
		a3.add(a1);
		a3.addAll(1, a);
		System.out.println(a3);
	}

}
