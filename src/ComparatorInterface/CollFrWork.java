package ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollFrWork implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String str=(String)o1;
		String str1=(String)o2;
		if(str.compareTo(str1)>0) {
			return 1;
		}
		else if(str.compareTo(str1)<0) {
			return -1;	
		}
		return 0;
	}
	public static void main(String[] args) {
		ArrayList le=new ArrayList<>();
		le.add("naga");
		le.add("Bannu");
		le.add("bittu");
		le.add("ammananna");
		le.add("swap");
		System.out.println(le);
		Collections.sort(le,new CollFrWork());
		System.out.println(le);		

	}


}
