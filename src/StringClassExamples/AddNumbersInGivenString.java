package StringClassExamples;

public class AddNumbersInGivenString {

	public static void main(String[] args) {
		String s="a11b22c33";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				int num1 = s.charAt(i)-48;
				sum=num1+sum;
			}

		}
		System.out.println("count of numbers in String ="+sum);
	}

}
