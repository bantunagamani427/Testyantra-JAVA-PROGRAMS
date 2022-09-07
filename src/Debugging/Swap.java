package Debugging;

public class Swap {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp;
		System.out.println("before swap:"+a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap:"+a+" "+b);
	}
 }
