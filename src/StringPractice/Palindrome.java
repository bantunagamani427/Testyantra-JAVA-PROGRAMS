package StringPractice;

public class Palindrome {

	public static void main(String[] args) {
		String s="malayalam";
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		if(rev.equals(s)) {
			System.out.println("given string "+s+" is palindrome");
		}
		else {
			System.out.println("given string "+s+" is not palindrome");

		}
		
	}

}
