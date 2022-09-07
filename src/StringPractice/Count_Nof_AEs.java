package StringPractice;

public class Count_Nof_AEs {

	public static void main(String[] args) {
String s="javatester";
int count=0;
	for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		if(ch>='a'||ch<='z') {
		count++;	
		}
	}
	System.out.println("no of a & e's in given string = "+count);
		}

}
