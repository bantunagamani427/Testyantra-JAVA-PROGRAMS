package CollectionFramework;

import java.util.ArrayList;

public class Passing_ArgumentInArraylist_Constructor {

	public static void main(String[] args) {
   
		ArrayList a=new ArrayList();
	
		a.add(0);
		a.add("naga");
		a.add(true);
		a.add('a');
		
		System.out.println("a size"+a.size());
		System.out.println("a objects:="+a);
		
		ArrayList a1=new ArrayList(a);
		
		a1.add("testyantra");
		a1.add(20);
		System.out.println("a1 objects:"+a1);
		System.out.println("a1 size="
				+ " "+a1.size());
		
	}

}
