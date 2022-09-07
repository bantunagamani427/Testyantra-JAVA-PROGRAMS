package ArrayListPractice;

import java.util.ArrayList;

public class FetchingObjectsUsingForEachLoop {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add("23");
		a.add("34");
		a.add("bannu");
		for( Object i:a) {
			System.out.println(i);
		}
	}

}
