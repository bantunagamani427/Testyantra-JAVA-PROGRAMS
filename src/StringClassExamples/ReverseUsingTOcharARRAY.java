package StringClassExamples;

public class ReverseUsingTOcharARRAY {

	public static void main(String[] args) {
		String s="Automation";
		char[] charr = s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(charr[i]);	
		}
	}

}
