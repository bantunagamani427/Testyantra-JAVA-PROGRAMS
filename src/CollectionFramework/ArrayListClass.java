package CollectionFramework;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		a.add(0);
		a.add("naga");
		a.add(true);
		a.add('a');
		
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.get(2));
		//System.out.println(a.remove(3));
		//System.out.println(a.remove("naga"));
		System.out.println(a);
		
		ArrayList a1=new ArrayList();
		
		a1.addAll(a);
		//a1.add(a);
		a1.add("testyantra");
		a1.add(20);
		System.out.println(a1);
		System.out.println(a1.size());
		
//		for(int i=0;i<a1.size();i++) {
//			System.out.println(a1.get(i));
//		}
		
		
		
	}

}
