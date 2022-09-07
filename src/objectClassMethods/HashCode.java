package objectClassMethods;

import java.util.Objects;

public class HashCode {
	int a;
	String s;
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(a, s);
	}

	@Override
	public boolean equals(Object obj) {
		HashCode other = (HashCode) obj;
		return a == other.a && s.equals( other.s);
	}

	HashCode(int a,String s){
		this.a=a;
		this.s=s;
	}

	public static void main(String[] args) {
		HashCode h=new HashCode(0, "bannu");
		System.out.println(h.hashCode());
		HashCode h1=new HashCode(20, "bittu");
		System.out.println(h1.hashCode());
		HashCode h2=new HashCode(20, "bittu");
		System.out.println(h2.hashCode());
		
		//equals//
		System.out.println(h.equals(h1));
		System.out.println(h1.equals(h2));
		System.out.println(h2.equals(h));
		
		//hashcode//
		System.out.println(h.hashCode());
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		
	}

}
