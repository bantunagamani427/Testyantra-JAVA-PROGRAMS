package StringPractice;

public class Remove_Duplicate_From_String {

	public static void main(String[] args) {
String s="java";
String unique="";
for(int i=0;i<s.length();i++) {
	char ch=s.charAt(i);
	if(unique.indexOf(ch)==-1) {
		unique=unique+ch;
	}
}
System.out.println(unique);
	}

}
