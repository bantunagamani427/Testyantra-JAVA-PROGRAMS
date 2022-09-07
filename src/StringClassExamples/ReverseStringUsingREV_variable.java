package StringClassExamples;

public class ReverseStringUsingREV_variable {

	public static void main(String[] args) {
		String s="Automation";
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println("reverse "+rev);
	}

}

