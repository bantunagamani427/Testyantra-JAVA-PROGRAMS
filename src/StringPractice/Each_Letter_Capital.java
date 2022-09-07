package StringPractice;

public class Each_Letter_Capital {

	public static void main(String[] args) {
String s="welcome to automation";
 String[] str=s.split(" ");
 String allLetters="";
 for(int i=0;i<str.length;i++) {
	String s1= str[i];
	String firstletter=s1.substring(0, 1).toUpperCase();
	String remainingletters=s1.substring(1);
	allLetters=allLetters+firstletter+remainingletters+" ";
 }
	System.out.println(allLetters);
	}

}
