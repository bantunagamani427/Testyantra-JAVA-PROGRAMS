package StringPractice;

public class ReverseSentence {

	public static void main(String[] args) {
		String s=" i am a test engineer";
		String [] str=s.split(" ");
		String rev="";
		for(int i=0;i<str.length;i++) {
			rev=str[i]+" "+rev;	 
		}
		System.out.println(rev);
	}

}
