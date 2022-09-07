package StringClassExamples;

public class Reverse_EachWordOfSentence_InSamePosition {

	public static void main(String[] args) {
		String s="Khatam ta ta bye bye";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			String strarr=str[i];
			String rev=" ";
			for(int j=0;j<strarr.length();j++) {
				rev=strarr.charAt(j)+rev;
			}
			System.out.print(rev);
		}
	}
	
}
