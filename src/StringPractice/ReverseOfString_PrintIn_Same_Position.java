package StringPractice;

public class ReverseOfString_PrintIn_Same_Position {

	public static void main(String[] args) {
		String s="i am a test engineer";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			String starr=str[i];
			String rev="";
			for(int j=0;j<starr.length();j++) {
				rev=starr.charAt(j)+rev; 
			}
			System.out.print(rev+" ");
		}
	}

}
