package Basic_Programs;

public class Sum_Product_of_givenNumber {

	public static void main(String[] args) {
		int n=12384;
		int rem,sum=0,prod=1;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			prod=prod*rem;
			n=n/10;
		}
		System.out.println("sum="+sum);
		System.out.println("product="+prod);
	}

}
