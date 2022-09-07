package StringPractice;

public class VowelsPrint {

	public static void main(String[] args) {
String s="Automatipon";
String str = s.toLowerCase();
for(int i=0;i<str.length();i++) {
	 char ch=str.charAt(i);
	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		 System.out.println("vowels "+ch);
	 }
	 
}
	}

}
