package MockQuestions;

public class Print_Lower_Upper_Character {

	public static void main(String[] args) {
		String s="Manual Automation Java";
		String[] str=s.split(" ");
		String lower="";
		String upper="";
		int lcount=0;
		int ucount=0;
		for(int i=0;i<str.length;i++) {
			String word=str[i];
			for(int j=0;j<word.length();j++) {
				char ch=word.charAt(j);
				if(ch>='a'&&ch<='z') {
					lower=lower+ch;
					lcount++;
				}
				else {
					upper=upper+ch;
					ucount++;
					
					
					
				}
			}}
		System.out.println(lower+"-"+lcount);
		System.out.println(upper+"-"+ucount);
		//System.out.println("lower="+lower);
		//System.out.println("upper="+upper);
	}

}
