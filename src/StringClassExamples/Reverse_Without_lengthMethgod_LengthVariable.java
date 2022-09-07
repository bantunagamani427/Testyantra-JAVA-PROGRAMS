package StringClassExamples;

public class Reverse_Without_lengthMethgod_LengthVariable {

	public static void main(String[] args) {
		String s="Automation";
		char[] charr = s.toCharArray();
		int count=0;
		String rev="";
		for(char carr:charr) {
			count++;
		}
		System.out.println(count);
		for(int i=0;i<count;i++) {
			rev=s.charAt(i)+rev;
			//System.out.println(s.charAt(i));
		}
		System.out.println(rev);
	}

}
