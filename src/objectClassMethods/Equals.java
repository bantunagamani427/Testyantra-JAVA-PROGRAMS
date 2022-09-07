package objectClassMethods;

public class Equals {
	int a;
	String s;
	Equals(int a,String s){
		this.a=a;
		this.s=s;
	}

	
	@Override
	public boolean equals(Object obj) {
		Equals other = (Equals) obj;
		return a == other.a && s.equals( other.s);
	}


	public static void main(String[] args) {
		Equals o=new Equals(10,"city");
		System.out.println(o);
		Equals o1=new Equals(20, "khammam");
		System.out.println(o1);
		Equals o2=new Equals(20, "khammam");
		System.out.println(o2);
		System.out.println(o.equals(o1));//10==other.20 && city.equals(other.khammam)
		System.out.println(o.equals(o2));//
		//o=o2;
		System.out.println(o.equals(o2));
		System.out.println(o1.equals(o2));
	}

}
