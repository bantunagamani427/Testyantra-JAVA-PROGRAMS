package WrapperClasses;

public class Convert_String_to_Primitive {

	public static void main(String[] args) {
		String s="123";
		int i=Integer.parseInt(s);
		System.out.println(i);

		String s1="34.6";
		double d=Double.parseDouble(s1);
		System.out.println(d);

		String s2="true";
		boolean b=Boolean.parseBoolean(s2);
		System.out.println(b);

		String s3="abc123";//number format exception
		int i1=Integer.parseInt(s3);
		System.out.println(i1);
	}

}
