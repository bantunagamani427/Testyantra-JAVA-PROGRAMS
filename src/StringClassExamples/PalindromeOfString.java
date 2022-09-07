package StringClassExamples;

public class PalindromeOfString {

	public static void main(String[] args) {
		String s="malayalam";
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println("revrse string="+rev);
		if(rev.equals(s)) {
			System.out.println
			("given string  "+rev+" is palindrome");
		}
		else {
			System.out.println("given string is "+rev+" not  palindrome");

		}
	}

}
