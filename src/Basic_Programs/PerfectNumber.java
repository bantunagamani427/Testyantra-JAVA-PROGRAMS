package Basic_Programs;

public class PerfectNumber {

	public static void main(String[] args) {
		int n=6,sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println(n+"is perfect");
		}
		else {
			System.out.println(n+"is not perfect");
		}
	}

}
