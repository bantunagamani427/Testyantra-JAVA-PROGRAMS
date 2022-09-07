package StringPractice;

public class Sum_of_grouped_numbers {

	public static void main(String[] args) {
		String s="a11b22c33";
		int num=0,sum=0;
		for(int i=0;i<s.length();i++) {
			char	ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				int n=s.charAt(i)-48;
				num=num*10+n;
			}
			else {
				sum=sum+num;
				num=0;
			}
		}
		System.out.println("sum of grouped number= "+(sum+num));
	}

}
