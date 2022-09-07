package objectClassMethods;

public class ObjClass {
	int a;
	String s;
	ObjClass(int a,String s){
		this.a=a;
		this.s=s;
	}

	@Override
	public String toString() {
		return "ObjClass [a=" + a + ", s=" + s + "]";
	}



	public static void main(String[] args) {
		ObjClass o=new ObjClass(10,"hyd");
		System.out.println(o);
	}

}
