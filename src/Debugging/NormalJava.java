package Debugging;

public class NormalJava {
	
	public static void add() {
		int a=1;
		int b=3;
		int	c=a+b;
		System.out.println("addition of numbers "+c);
	}
	
	public static void sub() {
		int a=8;
		int b=3;
		int c=a-b;
		System.out.println("subtraction of numbers: "+c);
	}
	
	public static void main(String[] args) {
		add();
		sub();
	}

}
