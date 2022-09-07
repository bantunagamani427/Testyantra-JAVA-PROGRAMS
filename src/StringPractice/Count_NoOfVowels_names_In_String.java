package StringPractice;

public class Count_NoOfVowels_names_In_String {

	public static void main(String[] args) {
		String [] str= {"triveni","gayathri","nagamani"};
		for(int i=0;i<str.length;i++) {
			String s=str[i];
			int count=0;
			for(int j=0;j<s.length();j++) {
				char ch=s.charAt(j);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					count++;
		
				}
			}
			System.out.println(s+"-"+count);
		}
	}

}

