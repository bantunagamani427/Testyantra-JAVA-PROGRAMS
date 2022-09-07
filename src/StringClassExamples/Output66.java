package StringClassExamples;

public class Output66 {

	public static void main(String[] args) {
		String s="a11b22c33b";
		int sum=0,num=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				int n = s.charAt(i)-48;
				num=num*10+n;
				//sum=num1+sum;
			}
			else {
				sum=sum+num;
				num=0;
			}

		}
		System.out.println("count of numbers in String ="+sum);
	}

	}


