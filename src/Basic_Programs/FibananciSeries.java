package Basic_Programs;

public class FibananciSeries {

	public static void main(String[] args) {
		int n=5;
		int n1=0,n2=1,sum=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=5;i++) {
			sum=n1+n2;
		
		System.out.print(" "+sum);
		n1=n2;
		n2=sum;
	}
	}
}
