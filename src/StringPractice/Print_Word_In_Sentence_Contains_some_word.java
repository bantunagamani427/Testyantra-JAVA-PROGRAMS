package StringPractice;

public class Print_Word_In_Sentence_Contains_some_word {

	public static void main(String[] args) {
String s="java manual automation";
String [] str=s.split(" ");
for(int i=0;i<str.length;i++) {
	if(str[i].contains("java")) {
		System.out.println(str[i]);
	}
}
	}

}
