package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_Reversing_Objects {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(23);
		a.add(34);
		a.add(45);
		a.add(9);
		Collections.sort(a);
		System.out.println("sorting objects"+a);

		Collections.reverse(a);
		System.out.println("sorting objects reverse order(descending order)"+a);
	}

}
