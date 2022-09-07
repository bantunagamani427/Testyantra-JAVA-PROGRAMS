package StringPractice;

public class Longest_Word_InString {

	public static void main(String[] args) {
		String s="hello who are you";
		String[]str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			String sv=str[i];
			System.out.println(sv+"- "+sv.length());
		}
		int max=0;
		String word="";
		for(int i=0;i<str.length;i++) {
			String sp=str[i];
			if(sp.length()>max) {
				max=sp.length();
				word=sp;
			}
		}
		
	 System.out.println(word);
	 
	}

}
