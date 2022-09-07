package StringPractice;

public class Longest_Word {

	public static void main(String[] args) {
String s="java manual automation bdd cucumber";
 String[] str=s.split(" ");
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
