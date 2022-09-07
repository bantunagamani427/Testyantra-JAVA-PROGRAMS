package StringClassExamples;

public class EachLetterCapital {

	public static void main(String[] args) {
		String s="welcome to india";
		String[] str=s.split(" ");
	String	allletters="";
		for(String s1:str) {
String firstletter = s1.substring(0, 1).toUpperCase();
String remainingletter = s1.substring(1);
allletters=allletters+firstletter+remainingletter;
		}
		System.out.println("each initial letter capital ="+allletters);
	}

}
