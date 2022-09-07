package StringClassExamples;

public class Reverse_Sentence_WithoutREV {

	public static void main(String[] args) {
		String s="I am Automation Test Engineer";
		String[] str=s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
	}

}