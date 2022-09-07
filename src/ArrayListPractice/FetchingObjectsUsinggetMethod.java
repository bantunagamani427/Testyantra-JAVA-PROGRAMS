package ArrayListPractice;

import java.util.ArrayList;

public class FetchingObjectsUsinggetMethod {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add("idli");
		a.add("java");
		a.add("amma");
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}

}
