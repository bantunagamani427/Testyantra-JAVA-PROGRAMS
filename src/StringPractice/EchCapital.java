package StringPractice;

public class EchCapital {

	public static void main(String[] args) {
String s="java_manual_automation";
String[] str=s.split("_");

String allletters="";
for(int i=0;i<str.length;i++) {
 String s1=str[i];
String	firstletters=s1.substring(0, 1).toUpperCase();
String remainningletters=s1.substring(1);
allletters=allletters+firstletters+remainningletters+" ";
}
System.out.println(allletters);


	}

}
