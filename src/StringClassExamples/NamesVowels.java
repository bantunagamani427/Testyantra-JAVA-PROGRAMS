package StringClassExamples;

public class NamesVowels {

	public static void main(String[] args) {
		String[] str= {"raman","irfan","sudheer","nagamani"};
		
		for(int i=0;i<str.length;i++) {
			String s = str[i];
			int count=0;
			for(int j=0;j<s.length();j++) {
				char charr = s.charAt(j);
			if(charr=='a'||charr=='e'||charr=='i'||charr=='o'||charr=='u') {
					count++;
					}	
			}
			System.out.println(s+"-"+count);
      }
		
	}

}
