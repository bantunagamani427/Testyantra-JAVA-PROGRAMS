package WrapperClasses;

public class Unboxing_1st_Way {

	public static void main(String[] args) {
		
//1st way 		
   int a=20;//primitive
   Integer a1=Integer.valueOf(a);//non primitive
   int a2=a1.intValue();//primitive
   System.out.println(a2);
   
   double d=5.6;
   Double d1=Double.valueOf(d);
   double d2=d1.doubleValue();
   System.out.println(d2);
   
   
   
	}

}
