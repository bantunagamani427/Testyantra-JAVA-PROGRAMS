package MockQuestions;

public class PrintCharcaterReverse_Last_to_Half {

	public static void main(String[] args) {
		String s="abcdefghijkl";

		System.out.println(s.substring(6, 12));

		for(int i=6;i<s.length();i++) {
			char ch = s.charAt(i);
			System.out.print(ch);

		}
	}

}
