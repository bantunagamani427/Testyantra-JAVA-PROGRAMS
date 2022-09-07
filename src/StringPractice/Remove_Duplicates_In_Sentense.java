package StringPractice;

public class Remove_Duplicates_In_Sentense {

	public static void main(String[] args) {
		String s="java manual automation";
		String[] str=s.split(" ");
		String unique="";

		for(int i=0;i<str.length;i++) {
			String word=str[i];
			//System.out.println(word);	

			for(int j=0;j<word.length();j++) {
				char ch = word.charAt(j);
				if(unique.indexOf(ch)==-1) {
					unique=unique+" "+ch;
				}
			}

			}
	System.out.println(unique);


	}

}
