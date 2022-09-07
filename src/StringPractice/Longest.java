package StringPractice;

public class Longest {

	public static void main(String[] args) {
		String s="ammananna naga akshithsai devansh athamama";
		String[] str=s.split(" ");
		int max=0;
		String  word= "";
		for(int i=0;i<str.length;i++) {
			String sp=str[i];
			if(sp.length()>max) {
				max=sp.length();
				word=sp;
			}
		}
		System.out.println(word+max);
	}

}
