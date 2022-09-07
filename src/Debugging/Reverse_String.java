package Debugging;

public class Reverse_String {

	public static void main(String[] args) {
		String s="java";
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println("reverse of a string: "+rev);
	}

}
