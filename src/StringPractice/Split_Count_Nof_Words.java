package StringPractice;

public class Split_Count_Nof_Words {

	public static void main(String[] args) {
		String s="hi nagamani welcome to the automation";
		String [] str=s.split(" ");
		int count=0;
		for(int i=0;i<str.length;i++) {
			count++;
			System.out.println(str[i]);

		}
		System.out.println("count no.of words = "+count);
	}

}
