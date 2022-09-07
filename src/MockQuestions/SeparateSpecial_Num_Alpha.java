package MockQuestions;

public class SeparateSpecial_Num_Alpha {

	public static void main(String[] args) {
		String s="hds243%^&jd72%^&*";

		String spec="";
		String dig="";
		String alph="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
				spec=spec+ch;		
			}
			else if(ch>='0'&&ch<='9') {
				dig=dig+ch;
			}
			else {
				alph=alph+ch;
			}
		}
		System.out.println("special="+spec);
		System.out.println("digits="+dig);
		System.out.println("alphabets="+alph);
	}

}
