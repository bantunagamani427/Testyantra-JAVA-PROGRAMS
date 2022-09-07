package StringClassExamples;

public class Reverse_Sentence_WithREV {

	public static void main(String[] args) {
		String s="i am automation test engineer";
		String rev="";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			rev=str[i]+" "+rev;
		}
		System.out.println(rev);
	}

  }
