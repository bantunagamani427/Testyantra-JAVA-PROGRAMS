package WrapperClasses;

public class Boxing_In_3_ways {

	public static void main(String[] args) {
		int i=12;
		Integer i1=new Integer(i);//1st way by creating wrapper class object
		System.out.println(i1);

		Integer i2=Integer.valueOf(i);//2nd by calling value of method
		System.out.println(i2);

		Integer i3=30;//3rd directly passing
		System.out.println(i3);
		
		Character a='b';
		System.out.println(a);
		
		Boolean b=true;
		System.out.println(b);
		
		Double d=new Double(i);
		System.out.println(d);
		
		
		
	}

}
