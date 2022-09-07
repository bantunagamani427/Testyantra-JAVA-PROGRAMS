package CollectionFramework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class CollFrWork implements Comparator  {
	@Override
	public int compare(Object o1, Object o2) {
		Integer cf=(Integer)o1;
		Integer cf1=(Integer)o2;
		if(cf>cf1) {
			return 1;
		}
		if(cf<cf1) {
			return -1;
		}		
		return 0;
	}
	public static void main(String[] args) {
		CollFrWork cf=new CollFrWork();		
		TreeSet s=new TreeSet<>(cf);
		s.add(23);
		s.add(56);
		s.add(12);
		s.add(45);
		System.out.println(s);
		System.out.println("iterate using for loop");
		for(Object t:s) {
			System.out.println(t);
		}
		System.out.println("iterate using iterator");
Iterator it=s.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	}
}