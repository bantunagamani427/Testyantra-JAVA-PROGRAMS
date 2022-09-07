package StringPractice;

public class Smallest_Word {

	public static void main(String[] args) {
String s="java manual automation bdd";
String[] str = s.split(" ");
int min=str.length;
String word="";
for(int i=0;i<str.length;i++) {
	String sp=str[i];
	if(sp.length()<min) {
		min=sp.length();
		word=sp;
	}
}
	System.out.println(word);
	}

}
