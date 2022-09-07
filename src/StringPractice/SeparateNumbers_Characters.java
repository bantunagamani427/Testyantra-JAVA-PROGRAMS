package StringPractice;

public class SeparateNumbers_Characters {

	public static void main(String[] args) {
		String s="jA&v1aD76eVLop29eR*";
		String Schar="";
		String Sdig="";
		String SpecChar="";
		int SpecCount=0;
		int digCount=0;
		int alphCount=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
				Schar=Schar+ch;	
				SpecCount++;
			}
			else if(ch>='0'&&ch<='9') {
				Sdig=Sdig+ch;
				digCount++;
			}
			else {
				SpecChar=SpecChar+ch;
				alphCount++;
			}
		}
		System.out.println("char="+Schar+"="+SpecCount);
		System.out.println("digits="+Sdig+"="+digCount);
		System.out.println("Special char="+SpecChar+"="+alphCount);
	}
}
