package Basic_Programs;

public class EvenSum_InGivenNumber {

	public static void main(String[] args) {
		int n=64321;
		int rem,sum=0;
		while(n>0) {
			rem=n%10;
			if(rem%2==0) {
				sum=sum+rem;
			}
			n=n/10;
		}
		System.out.println("sum="+sum);
	}

}
