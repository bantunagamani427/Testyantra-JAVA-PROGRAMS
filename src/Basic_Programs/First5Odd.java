package Basic_Programs;

public class First5Odd {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<2*n;i++) {
			if(n%i==0) {
				System.out.println(i+" ");
			}
		}
	}

}
