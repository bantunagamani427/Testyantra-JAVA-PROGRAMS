package StringClassExamples;

public class Remove_Duplicates {

	public static void main(String[] args) {
		String s="nagamani";
		String unique=""; 
		for(int i=0;i<s.length();i++) {

			char ch = s.charAt(i);
			if(unique.indexOf(ch)==-1) {
				unique=unique+ch;
			}

		}
		System.out.println("remove duplicates ="+unique);
	}
}