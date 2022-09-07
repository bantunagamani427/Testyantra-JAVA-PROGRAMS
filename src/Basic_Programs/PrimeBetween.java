package Basic_Programs;

public class PrimeBetween {

	public static void main(String[] args) {
		int m=2,n=10,sum=0;
		for(int i=m;i<=n;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("prime="+i+" ");
				sum=sum+i;
			}
		}
		System.out.println("sum="+sum);


	}
}