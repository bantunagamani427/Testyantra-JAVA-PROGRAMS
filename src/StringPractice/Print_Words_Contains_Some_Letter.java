package StringPractice;

public class Print_Words_Contains_Some_Letter {

	public static void main(String[] args) {
		String s="hello who are you";        
String[] str=s.split(" ");
for(int i=0;i<str.length;i++) {
	
	if(str[i].contains("o")) {
		System.out.println(str[i]);
	
	}
}

	}
}
