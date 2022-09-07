package Basic_Programs;

public class SumOf1st10_MultiplesOf7 {

	public static void main(String[] args) {
		int n=7;
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+(n*i);
		}
		System.out.println(sum);
	}

}
