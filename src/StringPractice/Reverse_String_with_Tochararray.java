package StringPractice;

public class Reverse_String_with_Tochararray {

	public static void main(String[] args) {
String s="automation";
 char[] ch=s.toCharArray();
 for(int i=s.length()-1;i>=0;i--) {
	 System.out.print(ch[i]);
 }
	}

}
