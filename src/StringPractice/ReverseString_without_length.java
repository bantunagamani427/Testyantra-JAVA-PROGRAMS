package StringPractice;

public class ReverseString_without_length {

	public static void main(String[] args) {
		String s="automation";
		int count=0;
		char[] ch=s.toCharArray();
		for(char ch1:ch) {
			count++;
		}
		for(int i=count-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}

	}
}