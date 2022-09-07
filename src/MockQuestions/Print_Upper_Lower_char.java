package MockQuestions;

public class Print_Upper_Lower_char {

	public static void main(String[] args) {
String s="Manual Automation Java";
String lower="";
String upper="";
for(int i=0;i<s.length();i++) {
	 char ch=s.charAt(i);
	 if(ch>=65&&ch<=95) {
		 upper=upper+ch;
	 }
	 else {
		 lower=lower+ch;
	 }
}
System.out.println("upper="+upper);
System.out.println("lower="+lower);
	}

}
